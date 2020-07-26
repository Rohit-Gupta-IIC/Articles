X = [[0], [1], [2], [3]]  
y = [0, 0, 1, 1]  
from sklearn.neighbors import KNeighborsClassifier  
neigh = KNeighborsClassifier(n_neighbors=2)  
neigh.fit(X, y)   
print(neigh.predict([[4.567]]))
print(neigh.predict_proba([[4.567]])) 
