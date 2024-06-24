"""
example_list = list(input("Enter the numbers that needs to be in list :").split(","))
sum=0

for list1 in example_list :
    sum = sum + int (list1)

print(sum)
"""

def calculate_sum(input_list):
    total_sum = sum(input_list)
    return total_sum


numbers = list(input("Enter the numbers that needs to be in list :").split(","))
print(numbers)

int_list = [int(x) for x in numbers]
print(int_list)
result = calculate_sum(int_list)

print(f"Sum of all elements in the list is : {result}")

