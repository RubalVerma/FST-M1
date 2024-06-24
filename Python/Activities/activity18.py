import pandas

dataframe = pandas.read_csv("employees.csv")

print("Full Data: ")
print(dataframe)

print("-------------------")
print("Usernames:")
print(dataframe["Usernames"])

print("-------------------")
print("Usernames & Password of the second row")
print("Username: ",dataframe["Usernames"][1], "|", "Password: ",dataframe["Passwords"][1])

#Sort the Usernames column in ascending order
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))
