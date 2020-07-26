from sklearn import datasets    
from sklearn.model_selection import train_test_split  
digits = datasets.load_digits()  #loading the MNIST Digits Database      
X,y = digits.data, digits.target     
X_train, X_test, y_train, y_test = train_test_split( X, y, test_size=0.3, random_state=0)    
