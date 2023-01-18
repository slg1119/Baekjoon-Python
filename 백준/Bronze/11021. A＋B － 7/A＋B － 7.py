def sum(a):
    return a[0] + a[1]


n = int(input())
test_cases = []
for _ in range(n):
    test_cases.append(list(map(int, input().split())))

for i in range(n):
    print(f"Case #{i + 1}: {sum(test_cases[i])}")
