import seaborn as sns    
    
df = pd.read_csv("kc_house_data.csv")    
    
sns.distplot(df['price'][1:100])   
