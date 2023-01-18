n = int(input())
m = list(map(int, input().split()))
max_value = max(m)
result = 0
for i in range(len(m)):
    result += m[i] / max_value * 100

print(result / n)
