def han(n: int) -> bool:
    if n > 1000:
        return False
    n = str(n)
    if int(n[0]) - int(n[1]) == int(n[1]) - int(n[2]):
        return True
    else:
        return False


n = int(input())

if n < 100:
    cnt = n
else:
    cnt = 99
    for i in range(100, n + 1):
        if han(n=i):
            cnt += 1

print(cnt)
