result = []
for _ in range(10):
    result.append(int(input()) % 42)
result = set(result)
print(len(result))
