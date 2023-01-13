n: str = input()

temp = 0

result = 0
if int(n) < 10:
    a: int = 0
    b: int = int(n)
else:
    a: int = int(n[0])
    b: int = int(n[1])

while True:
    temp = a + b
    a = b
    b = int(str(temp)[-1])
    result += 1
    if str(a) + str(b) == n:
        break
    elif str(a) + str(b) == "0" + n:
        break


print(result)
