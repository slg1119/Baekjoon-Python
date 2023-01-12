m, n = map(int, input().split())

"""
에라토스테네스의 체 사용
"""
for i in range(m, n + 1):
    if i == 1:  # 1은 소수가 아니다
        continue
    for j in range(2, int(i**0.5) + 1): # 제곱근까지 검사한다. https://codinghejow.tistory.com/189 참고
        if i % j == 0:  # 약수가 존재하므로 소수가 아니다.
            break  # 더 이상 검사할 필요가 없으므로 멈춘다.
    else:
        print(i)