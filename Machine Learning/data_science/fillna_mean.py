data.fillna(data.mean(), inplace=True)  
# count the number of NaN values in each column  
print(data.isnull().sum()) 
