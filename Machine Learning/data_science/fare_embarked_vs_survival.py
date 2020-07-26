fig = plt.figure(figsize=(5, 3))  
sns.violinplot(x='Embarked', y='Fare', hue='Survived', data=data, split=True, palette={0: "r", 1: "g"});  
