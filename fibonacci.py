#Coding=UTF-8


#Serie Fibonacci
import time
finalserie=int(input("ingresa hasta que número quiere terminar la serie fibonacci: "))
num1=0
num2=1
print("e aquí la serie fibonacci: ")
while num1<finalserie:
    num2=num1+num2
    num1=num2-num1
    print(str(num1), end=time.sleep(0.4))
 
 
print("fin")
