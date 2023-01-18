n, m = map(int, input().split())

result = 0

for i in range(n + 1):
    for j in range(60):
        for k in range(60):
            if f"{m}" in f"{str(i).zfill(2)}{str(j).zfill(2)}{str(k).zfill(2)}":
                result += 1

print(result)
