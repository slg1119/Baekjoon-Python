total = int(input())
len = int(input())

temp = 0
for i in range(len):
    n, m = input().split()
    temp += int(n) * int(m)

if temp == total:
    print("Yes")
else:
    print("No")
