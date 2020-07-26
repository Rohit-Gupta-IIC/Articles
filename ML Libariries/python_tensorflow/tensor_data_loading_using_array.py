## Numpy to pandas    
import numpy as np    
import pandas as pd  
  
h = [[1,2],[3,4]]     
df_h = pd.DataFrame(h)    
print('Data Frame:', df_h)    
    
## Pandas to numpy    
df_h_n = np.array(df_h)    
print('Numpy array:', df_h_n) 
