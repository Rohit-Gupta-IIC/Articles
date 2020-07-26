data['Died'] = 1 - data['Survived']  
data.groupby('Sex').agg('sum')[['Survived', 'Died']].plot(kind='bar', figsize=(3, 3),  
stacked=True, colors=['g', 'r']);
