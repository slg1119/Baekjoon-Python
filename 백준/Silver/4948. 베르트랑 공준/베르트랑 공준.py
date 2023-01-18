n = []

while True:
    _input = int(input())
    if _input == 0:
        break
    n.append(_input)

for i in n:
    result = 0
    if i == 1:
        print("1")
        continue

    for j in range(i + 1, i * 2 + 1):
        cnt = 0
        for k in range(2, int(j**0.5) + 1):
            if j % k == 0:
                cnt += 1
                break
        if cnt == 0:
            result += 1
    print(result)
