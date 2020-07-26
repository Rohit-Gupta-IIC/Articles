import seaborn as sns  
sns.set(style="whitegrid")  
  
# Load the example exercise dataset  
df = sns.load_dataset("exercise")  
  
# Draw a pointplot to show pulse as a function of three categorical factors  
g = sns.catplot(x="pulse", y="time", hue="diet", col="kind",  
                capsize=.6, palette="YlGnBu_d", height=6, aspect=.75,  
                kind="point", data=df)  
g.despine(left=True)  
