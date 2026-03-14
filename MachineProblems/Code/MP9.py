
number = int(input())

a, b = 0, 1
index = 0

if number == 0:
    print(f"{number} exists at position {index}")
else:
    while a <= number:
        if a == number:
            print(f"{number} exists at position {index}")
            break
        a, b = b, a + b
        index += 1
    else:
        print(f"{number} does not exist")
