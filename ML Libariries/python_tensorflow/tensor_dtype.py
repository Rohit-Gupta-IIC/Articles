import tensorflow as tf  
m_shape = tf.constant([ [10, 11],  
                        [12, 13],  
                        [14, 15] ]                        
                     )   
print(m_shape.dtype)

type_float = tf.constant(3.123456789, tf.float32)  
type_int = tf.cast(type_float, dtype=tf.int32)  
print(type_float.dtype)  
print(type_int.dtype)  
