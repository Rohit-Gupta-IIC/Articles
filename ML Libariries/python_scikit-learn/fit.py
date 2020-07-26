from sklearn import datasets        
from sklearn.linear_model import LinearRegression        
digits = datasets.load_digits()  #loading the MNIST Digits Database      
        
clf=LinearRegression()  #creating LinearRegression Classifier       
        
X,y = digits.data[:-10], digits.target[:-10]  #selecting the first 10 data and targets      
        
clf.fit(X,y)   #we fitted the given data and targets to form a model  
