leaves = int(input())
height = int(input())

tree_w = int(input())
tree_h = int(input())

if leaves <= 0 or height <= 0 or tree_w <= 0 or tree_h <= 0:
    print("INVALID INPUT")
    quit()

current_leaves = leaves
for layer in range(1, height + 1):
    for row in range(1, current_leaves + 1):
        spaces = ' ' * (height + leaves - row)
        stars = '*' * (2 * row - 1)
        print(spaces + stars)
    current_leaves += 1
        
for i in range(1, tree_h + 1):
    spaces = ' '  * (1 + (height + leaves) - tree_w)
    print(spaces + ('*' * tree_w))