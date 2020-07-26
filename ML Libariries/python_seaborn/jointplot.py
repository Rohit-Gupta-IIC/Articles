import numpy as np  
import seaborn as sns  
sns.set(style="ticks")  
  
rs = np.random.RandomState(11)  
x = rs.gamma(1, size=500)  
y = -.5 * x + rs.normal(size=500)  
  
sns.jointplot(x, y, kind="hex", color="#4CB391")
