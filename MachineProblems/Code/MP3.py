parenthesis = input()

while parenthesis == "" or parenthesis.isspace():
    print("PLEASE ENTER A VALID STRING")
    parenthesis = input()

stack = []

for char in parenthesis:
    
    if char.isspace():
        continue

    if char not in r'()[]{}':
        print("NOT BALANCED")
        quit()
        

    if char in '([{':
        stack.append(char)
        
    elif char in ')]}':
        
        if not stack:
            print("NOT BALANCED")
            quit()
            break
        
        top = stack.pop()
        
        if (char == ')' and top != '(') \
        or (char == ']' and top != '[') \
        or (char == '}' and top != '{'):
            print("NOT BALANCED")
            quit()

        
if not stack:
    print("BALANCED")
else:
    print("NOT BALANCED")