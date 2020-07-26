from dask import delayed,compute    
import dask    
@delayed    
def cube(num):    
     print("Cube function:",num)    
     print()    
     return num*num    
@delayed    
def sum_list(args):    
     print("Sum_list function:",args)    
     return sum(args)    
items=[1,2,3]    
computation_graph = sum_list([cube(i) for i in items])    
computation_graph.visualize() 
