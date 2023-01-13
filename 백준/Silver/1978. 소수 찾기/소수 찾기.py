m = input()
n = list(map(int, input().split()))

result = 0
cnt = 0
for i in n:
    if i == 1:
        continue
    for j in range(2, i):
        if i % j == 0:
            cnt += 1
            continue
    if cnt == 0:
        result += 1
    cnt = 0


print(result)
