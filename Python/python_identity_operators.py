a = 10
b = 10
print ('Line 1','a=',a,':',id(a), 'b=',b,':',id(b))
if ( a is b ):
   print ("Line 2 - a and b have same identity")
else:
   print ("Line 2 - a and b do not have same identity")
