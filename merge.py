def mergeSort(array:list):
	if(len(array)>1):
		mid = len(array)//2
		leftSubArray = array[:mid]
		rightSubArray = array[mid:]
		sortedArray = array
		mergeSort(leftSubArray)
		mergeSort(rightSubArray)
		i=j=k=0
		while(i<len(leftSubArray) and j<len(rightSubArray)):
			if(leftSubArray[i] < rightSubArray[j]):
				sortedArray.insert(leftSubArray[i],k)
				i = i+1
			else:
				sortedArray.insert(rightSubArray[j],k)
				j = j+1
			k = k+1
			printList(sortedArray)
def printList(array:list):
	for i in range(len(array)):
		print(f"{array[i]} ")
	print()
if(__name__ == '__main__'):
	array1 = [55,44,66,33,77,22,88,11,99,1]
	mergeSort(array1)
