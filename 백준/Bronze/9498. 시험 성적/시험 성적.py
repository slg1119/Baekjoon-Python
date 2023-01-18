# 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
#
input = int(input())

if (100 >= input >= 90):
    print ("A")
elif (90 > input >= 80):
    print ("B")
elif (80 > input >= 70):
    print ("C")
elif (70 > input >= 60):
    print ("D")
else:
    print ("F")