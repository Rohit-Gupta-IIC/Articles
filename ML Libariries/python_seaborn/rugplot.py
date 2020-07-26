import numpy as np  
import matplotlib.pyplot as plt  
import seaborn as sns  
sample = np.hstack((np.random.randn(300), np.random.randn(200)+5))  
fig, ax = plt.subplots(figsize=(8,4))  
sns.distplot(sample, rug=True, hist=False, rug_kws={"color": "g"},  
    kde_kws={"color": "k", "lw": 3})  
plt.show()
