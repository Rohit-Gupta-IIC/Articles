import tensorflow as tf  
  
r2_boolean = tf.constant([True, True, False], tf.bool)  
print(r2_boolean)  
## Rank 2  
r2_matrix = tf.constant([ [1, 2],  
                          [3, 4] ],tf.int16)  
print(r2_matrix) 
