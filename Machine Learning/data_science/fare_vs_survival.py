figure = plt.figure(figsize=(5, 3))  
plt.hist([data[data['Survived'] == 1]['Fare'], data[data['Survived'] == 0]['Fare']],   
         stacked=True, color = ['g','r'],  
         bins = 50, label = ['Survived','Dead'])  
plt.xlabel('Fare')  
plt.ylabel('Number of passengers')  
plt.legend();  
