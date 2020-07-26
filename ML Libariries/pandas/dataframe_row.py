import pandas as pd      
data = {'Name':['C','Sharp','Corner'], 'Age':[20,21,22], 'Address':['Delhi','Kanpur','Tamil Nadu']}      
df = pd.DataFrame(data)    
data1= df.loc[0]  
print(data1)
