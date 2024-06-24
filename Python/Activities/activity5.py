"""
num = int(input("Enter number to have its table : "))

for i in range(1,11):
    print(num,'x', i, '=', num*i)
"""

def multiplication_table(number):
    print(f"Multiplication table for {number}:")

    for i in range(1, 11):
        result = number * i
        print(f"{number} x {i} = {result}")
try:
    num = int(input("Enter a number: "))
    multiplication_table(num)

except ValueError:
    print("Invalid input. Please enter a valid number.")