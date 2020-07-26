import tensorflow as tf  
  
x = tf.constant([2.0], dtype = tf.float32)  
tensor_a = tf.constant([[1,2]], dtype = tf.int32)  
tensor_b = tf.constant([[3, 4]], dtype = tf.int32)  
  
#Sqaure Root  
print(tf.sqrt(x))  
#Exponential  
print(tf.exp(x))  
#Power  
print(tf.pow(x,x))  
#Add  
tensor_add = tf.add(tensor_a, tensor_b)  
print(tensor_add)  
#Substarct  
tensor_sub = tf.subtract(tensor_a, tensor_b)  
print(tensor_sub)  
#Multiply  
tensor_mul = tf.multiply(tensor_a, tensor_b)  
print(tensor_mul)  
#Divide  
tensor_div = tf.div(tensor_a, tensor_b)  
print(tensor_div)  
