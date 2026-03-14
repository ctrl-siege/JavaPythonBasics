
numbers = []
numOfEvenNumbers =  0
numOfOddNumbers = 0
numOfPositiveNumbers = 0
numOfNegativeNumbers = 0

for i in range(15):
    number = int(input())

    if number % 2 == 0:
        numOfEvenNumbers+=1
    else:
        numOfOddNumbers+=1

    if number > 0:
        numOfPositiveNumbers+=1
    else:
        numOfNegativeNumbers+=1

print(f"Count of Even Numbers: {numOfEvenNumbers}")
print(f"Count of Odd Numbers: {numOfOddNumbers}")
print(f"Count of Positive Numbers: {numOfPositiveNumbers}")
print(f"Count of Negative Numbers: {numOfNegativeNumbers}")

    