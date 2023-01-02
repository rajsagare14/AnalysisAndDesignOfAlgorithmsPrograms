class item:
	def __init__(self,value,weight):
		self.value = value
		self.weight = weight
def fractionalKnapsack(w,arr:list):
	final_value = 0.0
	arr.sort(key = lambda x:(x.value/x.weight),reverse=True)
	for item in arr:
		if item.weight <= w:
			w = w - item.weight
			final_value = final_value + item.value
		else:
			final_value = final_value + ((item.value*w)/item.weight)
			break
	return final_value
if __name__ == '__main__':
	w = 10
	arr = [item(70,10),item(100,20),item(120,30)]
	max_val = fractionalKnapsack(w,arr)
	print(max_val)