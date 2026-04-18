input = int(input())
num = 1
row = 1

while num <= input:
    for i in range(row):
        if num > input:
            break
        print(num, end=" ")
        num += 1
    print()
    row += 1