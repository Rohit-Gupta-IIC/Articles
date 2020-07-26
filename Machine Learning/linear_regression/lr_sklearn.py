import pandas as pd    
import numpy as np    
import matplotlib.pyplot as plt    
import seaborn as sns    
    
df = pd.read_csv("kc_house_data.csv")    
y= df['price'][1:100]    
x= df['sqft_living'][1:100]    
    
from sklearn.model_selection import train_test_split      #import model selection train test split for splitting the data into test and train for     
#model validation.    
    
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=101)    
    
from sklearn.linear_model import LinearRegression    
    
lr = LinearRegression()   # create an instance of Linear Regression Class    
    
x_train = x_train.values.reshape(-1,1) #we need to reshape as fit requires a Matrix    
    
lr.fit(x_train, y_train)  #calling the function fit to get the regression line equation    
#output: LinearRegression(copy_X=True, fit_intercept=True, n_jobs=None, normalize=False)    
    
print("b[0] = ",lr.intercept_)  #prints the b[0]    
    
print("b[1] = ",lr.coef_)       #prints the b[1]    
    
x_test = x_test.values.reshape(-1,1) #we need to reshape as predict requires a Matrix    
    
pred = lr.predict(x_test)   #Matrix of the predicted values    
    
plt.scatter(x_train,y_train)    
# predicted response vector     
y_pred = lr.intercept_ + lr.coef_*x_train    
    
# plotting the regression line     
plt.plot(x_train, y_pred, color = "g")     
    
# putting labels     
plt.xlabel('x')     
plt.ylabel('y')     
    
# function to show plot     
plt.show()      

sns.distplot((y_test-pred))  
