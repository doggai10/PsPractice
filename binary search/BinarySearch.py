def binary_search_recursion(array, find, start, end):
    if start > end :
        return

    mid = (start + end) // 2

    if array[mid]==find:
        return mid

    elif array[mid] > find:
        return binary_search_recursion(array,find,start,mid-1);

    else:
        return binary_search_recursion(array,find,mid+1,end);


def binary_search(array,find,start,end):
    while start <=end:
        mid = (start+end) //2
        if array[mid]==find:
            return mid
        elif array[mid]>find:
            end = mid-1
        else:
            start=mid+1
    return None

n, find = list(map(int, input().split()))
array = list(map(int, input().split()))

result = binary_search_recursion(array,find,0,n-1)
if result == None:
    print("원소가 존재하지 않습니다.")
else:
    print(result)
result =binary_search(array,find,0,n-1)
if result == None:
    print("원소가 존재하지 않습니다.")
else:
    print(result)