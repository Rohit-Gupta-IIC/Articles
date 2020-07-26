fig = plt.figure(figsize=(3, 3))  
sns.violinplot(x='Sex', y='Age',   
hue='Survived', data=data, split=True,  
palette={0: "r", 1: "g"}); 
