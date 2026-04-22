budget = int(input())
items = []

if budget <= 10:
    print("INVALID")
    quit()

while budget > 0:
    
    item = int(input())

    if item < 0:
        continue
    
    if item == 0 or item > budget:
        break  

    if item <=budget:
        budget -=item
        items.append(item)
        continue
      
    

print(len(items))
print(budget)