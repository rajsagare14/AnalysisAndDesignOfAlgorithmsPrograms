INF = 99999
G = [
	[0, 9, 75, 0, 0],
     [9, 0, 95, 19, 42],
     [75, 95, 0, 51, 66],
     [0, 19, 51, 0, 31],
     [0, 42, 66, 31, 0]
	]
V = 5
selected = [0,0,0,0,0]
no_edge = 0
selected[0] = True
print("Edge : Weight")
while no_edge<V-1:
	minimum = INF
	x = 0
	y = 0
	for i in range(V):
		if selected[i]:
			for j in range(V):
				if (not selected[j]) and G[i][j]:
					if minimum>G[i][j]:
						minimum = G[i][j]
						x = i
						y = j
	print(f"{x} - {y} : {G[x][y]}")
	selected[y] = True
	no_edge = no_edge + 1