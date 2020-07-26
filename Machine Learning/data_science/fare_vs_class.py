ax = plt.subplot()  
ax.set_ylabel('Average fare')  
data.groupby('Pclass').mean()['Fare'].plot(kind='bar', figsize=(5, 3), ax = ax);  
