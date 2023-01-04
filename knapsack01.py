def knapsack01(val,wt,W,n):
	if n == 0 or W == 0:
		return 0
	if wt[n-1] > W:
		return knapsack01(val,wt,W,n-1)
	else:
		return max(val[n-1] + knapsack01(val,wt,W-wt[n-1],n-1),knapsack01(val,wt,W,n-1))
if __name__ == "__main__":
	val = [60,100,120]
	wt = [10,20,30]
	W = 50
	n = len(val)
	print(knapsack01(val,wt,W,n))