n, m = map(int, input().split())
a = list(map(int, input().split()))
for i in range(n):
    if a[i] < m:
        print(a[i], end=" ")
