inputs = input()

count0 = 0
count1 = 0
if inputs[0] == "1":
    count0 += 1
else:
    count1 += 1

for i in range(0, len(inputs) - 1):
    if inputs[i] != inputs[i + 1]:
        if inputs[i + 1] == "1":
            count0 += 1
        else:
            count1 += 1

print(min(count0, count1))
