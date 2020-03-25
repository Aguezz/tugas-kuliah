'''
@author Agus Stiawan - H96219038
'''
n = int(input("Input number of rows : "))

for i in range(n):
    if i % 2 == 0:
        p, q = 1, 0
    else:
        p, q = 0, 1

    for j in range(i + 1):
        if j % 2 == 0:
            print(p, end="")
        else:
            print(q, end="")
    print("")
