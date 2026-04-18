matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("Element at row 1, column 2:", matrix[0][1])  # Output: 2

# Loop through the 2D list
print("\nMatrix elements:")
for row in matrix:
    for value in row:
        print(value, end=" ")
    print()

# Modify an element
matrix[1][1] = 50
print("\nUpdated matrix:")
for row in matrix:
    print(row)

# Add a new row
matrix.append([10, 11, 12])
print("\nAfter adding a new row:")
for row in matrix:
    print(row)

# Sum all elements
total = 0
for row in matrix:
    for value in row:
        total += value

print("\nSum of all elements:", total)