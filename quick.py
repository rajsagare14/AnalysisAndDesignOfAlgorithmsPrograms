def partition(array:list,low:int,high:int):
	pivot = array[high]
	i = low - 1
	for j in range(low,high):
		if array[j]<=pivot:
			i = i + 1
			array[i],array[j] = array[j],array[i]
	array[i+1],array[high] = array[high],array[i+1]
	return i+1
def quickSort(array:list,low:int,high:int):
	if low<high:
		piv = partition(array,low,high)
		quickSort(array,low,piv-1)
		# print(array)
		quickSort(array,piv+1,high)
		# print(array)
		
if __name__=='__main__':
	array = [88,44,66,22,33,77,55,11,99,1]
	quickSort(array,0,len(array)-1)
	print(array)