list = input().split()
outlier = input()
count = 0

for item in list[:]:
    if item == outlier:
        count += 1
        list.remove(item)

print(count)
print(len(list))