import seaborn as sns; sns.set(color_codes=True)  
tips = sns.load_dataset("tips")  
ax = sns.regplot(x=x, y=y, marker="+")
