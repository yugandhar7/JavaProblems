num = int(input())
days = int(num/(24*60*60))
if (days > 1):
    print(days, "days")
x = num % (24*60*60)
hours = int(x/(24*60))
if (hours > 1):
    print(hours, "hours")
x = num % (24*60)
min = int(x/60)
if (min > 1):
    print(min, "min")
x = num % 60
print(x, "sec")
