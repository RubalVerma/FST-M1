def fibonacci(number):
    if number <=1:
        return number
    else : 
        return(fibonacci(number - 1 ) + fibonacci(number-2))
    

nterms = int(input("Enter number :"))

if(nterms <=0):
    print("Please enter positive number")
else: 
    print("Fibonacci Sequenece :")
    for i in range(nterms):
        print(fibonacci(i))