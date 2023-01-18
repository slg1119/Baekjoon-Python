n = int(input())
money = [500, 100, 50, 10, 5, 1]
n = 1000 - n
count = 0
for i in money:
    count += n // i
    n %= i

print (count)