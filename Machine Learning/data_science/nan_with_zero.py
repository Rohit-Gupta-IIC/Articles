data = data.replace(np.NaN, 0)  
# count the number of NaN values in each column  
print(data.isnull().sum()) 
