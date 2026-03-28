
size = 5
# preferrly odd

# Printing P
for i in range(size):
    if i == 0 or i == int(size/2):
        print("*" * size)
        continue

    if i > 0 and i < int(size/2):
        print(f'*{' ' * int(size-2)}*')
        continue
    print('*')

print()

# Printing C
for i in range(size):
    if i == 0 or i == size-1:
        print("*" *size)
        continue
    print("*")

print()

# Printing S
for i in range(size):
    if i == 0 or i == int(size/2) or i == size-1:
        print("*" *size)
        continue
    if i > 0 and i < int(size/2):
        print(f'*')
        continue
    if i < size and i > int(size/2):
        print(f'{' ' * int(size-1)}*')
        continue

print()

# Printing C
for i in range(size):
    if i == 0 or i == size-1:
        print("*" *size)
        continue
    print("*")
