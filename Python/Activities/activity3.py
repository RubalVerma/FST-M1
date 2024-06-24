user1 = input("What is player 1 name")
user2 = input("What is player 2 name")

user1_ans = input(user1+" do you want to choose rock, paper or scissors? ").lower()
user2_ans = input(user2+" do you want to choose rock, paper or scissors? ").lower()

if user1_ans == user2_ans:
    print("It is a tie")
elif user1_ans == 'rock':
   if user2_ans == 'scissor':
       print("Rocks wins!")
   else:
       print("Paper wins")
elif user1_ans == 'scissor':
    if user2_ans == 'paper':
        print("scissor wins")
    else: 
        print("Rock wins")
elif user1_ans == 'paper':
    if user2_ans == 'rock':
        print("paper wins")
    else:
        print("scissor wins!")  
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")         
