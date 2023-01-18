one, two, three = map(int, input().split())

if one == two == three:
    print(10000 + 1000 * one)
elif one == two:
    print(1000 + 100 * one)
elif one == three:
    print(1000 + 100 * one)
elif three == two:
    print(1000 + 100 * two)
elif one != two and one != three and two != three:
    m = max(one, two, three)
    print(m * 100)
