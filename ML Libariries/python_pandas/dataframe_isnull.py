import pandas as pd  
data = {'Name':['C','Sharp','Corner'], 'Age':[20,21,22], 'Address':['Delhi','Kanpur','Tamil Nadu']}   
df = pd.DataFrame(data)  
df.isnull() 
