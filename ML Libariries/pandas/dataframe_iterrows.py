import pandas as pd  
import numpy as np  
data = {'Name':[np.nan,'Sharp','Corner'], 'Age':[20,np.nan,22], 'Address':[np.nan,'Kanpur','Tamil Nadu']}   
df = pd.DataFrame(data)  
for i, j in df.iterrows():  
  print(i,j)  
  print()  
