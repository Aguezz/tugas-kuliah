'''
@author Agus Stiawan - H96219038
'''
n = int(input("Input number : "))
print("The first n natural number are :", n)

sum = 0
for i in range(1, n+1):
    print(i)
    sum += i

print("The sum of Natural Number upto", n, "terms :", sum)
