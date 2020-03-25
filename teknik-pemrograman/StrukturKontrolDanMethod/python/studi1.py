'''
@author Agus Stiawan - H96219038
'''
num1 = int(input("Input the 1st number : "))
num2 = int(input("Input the 2nd number : "))
num3 = int(input("Input the 3rd number : "))

if num1 > num2 and num1 > num3:
    print("The greatest:", num1)

if num2 > num1 and num2 > num3:
    print("The greatest:", num2)

if num3 > num1 and num3 > num2:
    print("The greatest:", num3)
