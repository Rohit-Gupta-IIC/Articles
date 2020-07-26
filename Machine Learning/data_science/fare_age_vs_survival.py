plt.figure(figsize=(25, 7))  
ax = plt.subplot()  
  
ax.scatter(data[data['Survived'] == 1]['Age'], data[data['Survived'] == 1]['Fare'],   
           c='green', s=data[data['Survived'] == 1]['Fare'])  
ax.scatter(data[data['Survived'] == 0]['Age'], data[data['Survived'] == 0]['Fare'],   
           c='red', s=data[data['Survived'] == 0]['Fare']); 
