n = int(input())

for _ in range(n):

    ox_list = input()
    result = 0
    sum_score = 0
    for i in ox_list:
        if i == "O":
            result += 1
        else:
            result = 0
        sum_score += result
    print(sum_score)
