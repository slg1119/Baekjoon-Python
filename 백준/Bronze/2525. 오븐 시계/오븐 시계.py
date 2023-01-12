hour, minute = map(int, input().split())
add_minute = int(input())

time = (hour * 60) + minute + add_minute
print(f"{time // 60  if (time // 60 < 24) else (time // 60) - 24 } {time % 60}")
