def binary_search(array, find, start,end):
    while start<=end:
        mid = (start+end)//2
        if array[mid]==find:
            return mid

        elif array[mid] > find:
            end=mid-1
        else:
            start = mid+1

    return None


n = int(input())

array = list(map(int, input().split()))
array.sort()

m = int(input())

x = list(map(int, input().split()))

for i in x:
    result = binary_search(array,i,0,n-1)
    if result == None:
        print('no', end=' ')
    else:
        print('yes', end=' ')

print()
countingSort= [0] * 10000000

for i in array:
    countingSort[i]=1

for i in x:
    if countingSort[i]==1:
        print('yes', end=' ')
    else:
        print('no', end=' ')

print()

setArray = set(array)

for i in x:
    if i in setArray:
        print('yes', end=' ')
    else:
        print('no', end=' ')
print()