
count = int(input("Countdown from: "))

match count:
    case 5:
        print("5")
    case 4:
        print("4")
    case 3:
        print("3")
    case 2:
        print("2")
    case 1:
        print("1")
    case _:
        print("Number out of bound.")