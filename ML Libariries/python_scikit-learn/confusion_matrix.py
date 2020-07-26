# Python script for confusion matrix creation.   
from sklearn.metrics import confusion_matrix    
actual = [1, 1, 0, 1, 0, 0, 1, 0, 0, 0]   
predicted = [1, 0, 0, 1, 0, 0, 1, 1, 1, 0]   
results = confusion_matrix(actual, predicted)   
print ('Confusion Matrix :')  
print(results)  
