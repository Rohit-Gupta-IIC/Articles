

    # importing all the required libraries  
    import matplotlib.pyplot as plt    
    %matplotlib inline  
    import numpy as np    
    from sklearn.cluster import KMeans    
      
    #dummy data  
    X = np.array([[1, 2],    
                  [1.5, 1.8],    
                  [5, 8 ],    
                  [8, 8],    
                  [1, 0.6],    
                  [9,11],    
                  [1,3],    
                  [8,9],    
                  [0,3],    
                  [5,4],    
                  [6,4],    
                  [1,2],    
                  [2,4],    
                  [11,5],    
                  [2.56,5.6],    
                  [2, 2],    
                  [1.8, 1.8],    
                  [8, 8 ],    
                  [5, 5],    
                  [0.6, 0.6],    
                  [11,11],    
                  [3,3],    
                  [9,9],])   
      
    #plotting the dummy data  
    plt.scatter(X[:,0],X[:,1], label='True Position')   
    plt.show()   
      
    #creating the an object of sklearn.cluster.KMeans class  
    #Passed the number of clusers value to be 3, i.e. we are making a 3-Means clusering model  
    kmeans = KMeans(n_clusters=3)    
      
    #passing the data to the model  
    kmeans.fit(X)  
      
    #printing the centroid values  
    print(kmeans.cluster_centers_)  
      
    #Printing the predicted values  
    print(kmeans.labels_)  
      
    #Plotting the data based upon their predicted cluster  
    plt.scatter(X[:,0],X[:,1], c=kmeans.labels_, cmap='rainbow')  
    plt.show() 


