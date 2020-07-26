from IPython.core.display import HTML  
HTML(""" 
<style> 
.output_png { 
    display: table-cell; 
    text-align: center; 
    vertical-align: middle; 
} 
</style> 
""");  
%matplotlib inline  
  
import warnings  
warnings.filterwarnings('ignore')  
warnings.filterwarnings('ignore', category=DeprecationWarning)  
  
import pandas as pd  
pd.options.display.max_columns = 100  
  
from matplotlib import pyplot as plt  
import numpy as np  
  
import seaborn as sns  
  
import pylab as plot  
params = {   
    'axes.labelsize': "large",  
    'xtick.labelsize': 'x-large',  
    'legend.fontsize': 20,  
    'figure.dpi': 150,  
    'figure.figsize': [25, 7]  
}  
plot.rcParams.update(params)
