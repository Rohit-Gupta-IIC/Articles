

    #importing the required libraries  
    import matplotlib.pyplot as plt  
    import numpy as np  
    import tensorflow as tf  
      
    points_n = 200 #number of data points  
    clusters_n = 3 #number of classes in which points needs to be classifies  
    iteration_n = 100 #epoch value  
      
    #initializing the placehlders  
    points = tf.constant(np.random.uniform(0, 10, (points_n, 2)))  
    centroids = tf.Variable(tf.slice(tf.random_shuffle(points), [0, 0], [clusters_n, -1]))  
    points_expanded = tf.expand_dims(points, 0)  
    centroids_expanded = tf.expand_dims(centroids, 1)  
      
    #Creation of tensor to hold the euclidean disatnce formula  
    distances = tf.reduce_sum(tf.square(tf.subtract(points_expanded, centroids_expanded)), 2)  
    assignments = tf.argmin(distances, 0)  
      
    #logic to generate the model  
    means = []  
    for c in range(clusters_n):  
        means.append(tf.reduce_mean(  
          tf.gather(points,   
                    tf.reshape(  
                      tf.where(  
                        tf.equal(assignments, c)  
                      ),[1,-1])  
                   ),reduction_indices=[1]))  
      
    new_centroids = tf.concat(means, 0)  
      
    update_centroids = tf.assign(centroids, new_centroids)  
    init = tf.global_variables_initializer()  
      
    #session to execute the logic and generate the model  
    with tf.Session() as sess:  
      sess.run(init)  
      for step in range(iteration_n):  
        [_, centroid_values, points_values, assignment_values] = sess.run([update_centroids, centroids, points, assignments])  
      
      #to print the centroid values    
      print("centroids", centroid_values)  
      
    #plotting of the dummy data with centroid values  
    plt.scatter(points_values[:, 0], points_values[:, 1], c=assignment_values, s=50, alpha=0.5)  
    plt.plot(centroid_values[:, 0], centroid_values[:, 1], 'kx', markersize=15)  
    plt.show() 


