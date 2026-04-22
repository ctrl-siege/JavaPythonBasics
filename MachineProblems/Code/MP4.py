
number = int(input())

if number <= 0:
    print("INVALID INPUT")
    quit()

if number > 25:
    print("EXCEEDS MAXIMUM SIZE")
    quit()

for i in range(1, number + 1):
    for j in range(1, number + 1):
        print(f"{i*j:5}", end=" ")
    print()