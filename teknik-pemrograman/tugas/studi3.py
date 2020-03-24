n = int(input("Input number of rows : "))

for i in range(n):
    if i % 2 == 0:
        p = 1
        q = 0
    else:
        p = 0
        q = 1

    for j in range(i + 1):
        if j % 2 == 0:
            print(p, end="")
        else:
            print(q, end="")
    print("")
