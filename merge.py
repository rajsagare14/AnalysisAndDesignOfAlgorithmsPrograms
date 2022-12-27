def merge(leftSubArray : list, rightSubArray : list):
    i=j=k=0
    array = leftSubArray
    array = array.extend(rightSubArray)
    while(i < len(leftSubArray) and j < len(rightSubArray)):
        if(leftSubArray[i] < rightSubArray[j]):
            array[k] = leftSubArray[i]
            i = i + 1
        else:
            array[k] = rightSubArray[j]
            j = j + 1
        k = k + 1

    while i<len(leftSubArray):
        array[k] = leftSubArray[i]
        i = i + 1
        k = k + 1
    while j<len(rightSubArray):
        array[k] = rightSubArray[j]
        j = j + 1
        k = k + 1
    print(f"Merge = {array}")
    return array

def mergeSort(array: list):
    if(len(array)>1):
        i=j=k=0
        mid = len(array)//2
        leftSubArray = array[:mid]
        rightSubArray = array[mid:]
        mergeSort(leftSubArray)
        mergeSort(rightSubArray)
        while(i<len(leftSubArray) and j<len(rightSubArray)):
            if leftSubArray[i]<rightSubArray[j]:
                array[k] = leftSubArray[i]
                i = i + 1
            else:
                array[k] = rightSubArray[j]
                j = j + 1
            k = k + 1
        while(i<len(leftSubArray)):
            array[k] = leftSubArray[i]
            i = i + 1
            k = k + 1
        while(j<len(rightSubArray)):
            array[k] = rightSubArray[j]
            j = j + 1
            k = k + 1
        print(array)


            

def printList(array: list):
    for i in range(len(array)):
        print(f"{array[i]} ")
    print()
if (__name__ == '__main__'):
    array = [55, 44, 66, 33, 77, 22, 88, 11, 99, 1]
    sortedArray = mergeSort(array)
    print(sortedArray)
