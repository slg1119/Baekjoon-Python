n = int(input())

temp = []
for i in range(n):
    temp.append(input().split())

for i in temp:
    temp_str = ""
    for j in i[1]:
        temp_str += j * int(i[0])
    print(temp_str)
