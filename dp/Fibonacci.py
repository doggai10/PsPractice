def fibo(x):
    if x == 1 or x == 2:
        return 1
    return fibo(x-1)+(x-2)

print(fibo(5))

d= [0]*100
# def fibo_memo(x):
#     if x== 1 or x== 2:
#         return 1
#     if d[x]!=0:
#         return d[x]
#     d[x]=fibo_memo(x-1)+fibo_memo(x-2)
#     return d[x]
#
# print(fibo_memo(99))
d[1]=1
d[2]=1
n=99

for i in range(3, n+ 1):
    d[i] = d[i - 1] + d[i - 2]

print(d[99])