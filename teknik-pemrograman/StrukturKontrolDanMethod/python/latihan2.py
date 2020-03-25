'''
@author Agus Stiawan - H96219038
'''
n = int(input("Input number of rows : "))

for i in range(1, n+1):
    for j in range(i, n):
        print(" ", end="")

    for j in range(i):
        print(i, end=" ")
    print("")
