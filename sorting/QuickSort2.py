array= [5,7,9,0,3,1,6,2,4,8]


def quick_sort(array):

    if len(array) <=1:
        return array

    pivot = array[0]
    sorting = array[1:]

    left_side = [x for x in sorting if x<=pivot]
    right_side = [x for x in sorting if x>pivot]

    return quick_sort(left_side)+[pivot]+quick_sort(right_side)


print(quick_sort(array))