## rank 0  
# Default name  
import tensorflow as tf  
r1 = tf.constant(1, tf.int16)   
print(r1)  
r2 = tf.constant(1, tf.int16, name = "my_scalar")   
print(r2)
