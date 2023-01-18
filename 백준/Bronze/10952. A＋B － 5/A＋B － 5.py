temp = []
while True:
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break
    temp.append([n, m])

for i, j in temp:
    print(i + j)