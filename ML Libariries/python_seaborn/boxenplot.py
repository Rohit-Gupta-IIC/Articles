import seaborn as sns  
sns.set(style="whitegrid")  
  
diamonds = sns.load_dataset("diamonds")  
clarity_ranking = ["I1", "SI2", "SI1", "VVS2", "VVS1", "IF" "VS2", "VS1"]  
  
sns.boxenplot(x="clarity", y="carat",  
              color="g", order=clarity_ranking,  
              scale="linear", data=diamonds)
