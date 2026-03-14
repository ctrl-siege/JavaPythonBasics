
grades = []
highestGrade = 0
lowestGrade = 0
numOfStudentsPassed = 0

for i in range(10):

    grade = int(input())
    grades.append(grade)

    if highestGrade < grade:
        highestGrade = grade
    
    if lowestGrade >= grade or lowestGrade == 0: 
        lowestGrade = grade
    
    if grade >= 75:
        numOfStudentsPassed+=1

averageGrade = sum(grades) / len(grades)

print(f"Average Grade: {int(averageGrade)}")
print(f"Highest Grade: {highestGrade}")
print(f"Lowest Grade: {lowestGrade}")
print(f"Number of Students Passed: {numOfStudentsPassed}")
