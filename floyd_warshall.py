INF = 9999999
nV = 4
def floyd_warshall(G):
	distance = list(map(lambda i: list(map(lambda j: j,i)),G))
	print_solution(distance)
	print("")
	print_solution(G)
	print("")
	for k in range(nV):
		for i in range(nV):
			for j in range(nV):
				distance[i][j] = min(distance[i][j],distance[i][k]+distance[k][j])
	print_solution(distance)
	print("")
	print_solution(G)
def print_solution(distance):
	for i in range(nV):
		for j in range(nV):
			if distance[i][j] == INF:
				print("INF",end=" ")
			else:
				print(f"{distance[i][j]}",end="  ")
		print(" ")
if __name__ == "__main__":
	G = [
		[0,3,INF,5],
		[2,0,INF,4],
		[INF,1,0,INF],
		[INF,INF,2,0]
	]
	floyd_warshall(G)