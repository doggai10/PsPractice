inputs = input()

result = int(inputs[0])
for i in range(1, len(inputs)):
    num = int(inputs[i])
    if num <= 1 or result <= 1:
        result += num
    else:
        result *= num

print(result)
