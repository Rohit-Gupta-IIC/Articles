import tensorflow as tf  
# Create a vector of 1  
print(tf.ones([10, 10]))              
# Create a vector of ones with the same number of rows as m_shape  
print(tf.ones(m_shape.shape[0]))  
# Create a vector of ones with the same number of column as m_shape  
print(tf.ones(m_shape.shape[1]))  
  
print(tf.ones(m_shape.shape))   
