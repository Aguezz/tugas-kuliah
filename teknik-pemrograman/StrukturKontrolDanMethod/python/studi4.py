'''
@author Agus Stiawan - H96219038
'''
x = float(input("Input floating-point number : "))
y = float(input("Input floating-point another number : "))

x = round(x * 1000) / 1000

y = round(y * 1000) / 1000

if x == y:
    print("They are the same up to three decimal places")
else:
    print("They are different")
