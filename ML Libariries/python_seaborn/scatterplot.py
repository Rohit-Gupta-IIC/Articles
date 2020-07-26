import seaborn as sns  
sns.set()  
  
# Load the example iris dataset  
planets = sns.load_dataset("planets")  
  
cmap = sns.cubehelix_palette(rot=-.5, as_cmap=True)  
ax = sns.scatterplot(x="distance", y="orbital_period",  
                     hue="year", size="mass",  
                     palette=cmap, sizes=(100, 100),  
                     data=planets)
