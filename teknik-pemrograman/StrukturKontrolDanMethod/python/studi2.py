'''
@author Agus Stiawan - H96219038
'''
year = int(input("Input the year : "))

x = (year % 4) == 0
y = (year % 100) != 0
z = ((year % 100 == 0) and (year % 400 == 0))

if (x and (y or z)):
    print(year, "is a leap year")
else:
    print(year, "is not a leap year")
