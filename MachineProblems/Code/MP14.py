values = []
num = int(input())

for i in range(num):
    value = int(input())
    if value == -1:
        break
    values.append(value)
    
total = 0

for n in values:
    if n >= 85:
        print("FAST")
    else:
        print("SLOW")
    total += n

average = total // num

print(average)

if average >= 85:
    print("FAST")
else:
    print("SLOW")