import tensorflow as tf  
  
## Create, run  and evaluate a session  
x = tf.constant([2])  
y = tf.constant([4])              
  
## Create operator  
multiply = tf.multiply(x, y)  
  
## Create a session to run the code  
sess = tf.Session()  
result_1 = sess.run(multiply)  
print(result_1)  
sess.close()
