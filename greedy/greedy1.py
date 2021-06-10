n = int(input())
arr = list(map(int, input().split()))
arr.sort();

count = 0
group = 0
for i in arr:
    count += 1
    if count >= i:
        count = 0
        group += 1

print(group)
