
import tensorflow as tf  
  
# Create a Variable  
var = tf.get_variable("var", [1, 2])  
print(var)  
  
#following initializes the variable with a initial/default value  
var_init_1 = tf.get_variable("var_init_1", [1, 2], dtype=tf.int32,  initializer=tf.zeros_initializer)  
print(var_init_1)         
  
#Initializes the first value of the tensor equals to tensor_const  
tensor_const = tf.constant([[10, 20],[30, 40]])  
var_init_2 = tf.get_variable("var_init_2", dtype=tf.int32,  initializer=tensor_const)  
print(var_init_2) 
