data.groupby('Sex').agg('mean')[['Survived', 'Died']].plot(kind='bar', figsize=(3, 3),   
stacked=True, colors=['g', 'r']);
