class Graph:
	def __init__(self,vertices):
		self.V = vertices
		self.graph = []
	def addEdge(self,u,v,w):
		self.graph.append([u,v,w])
	def find(self,parent,i):
		if parent[i]==i:
			return i
		return self.find(parent,i)
	def union(self,parent,rank,x,y):
		if rank[x]<rank[y]:
			parent[x] = y
		elif rank[x] < rank[y]:
			parent[y] = x
		else:
			parent[y] = x
			rank[x] = rank[x] + 1
	def KruskalsMST(self):
		pass
if __name__ == "__main__":
	g = Graph(4)
	
	g.addEdge(0,1,10)
	g.addEdge(0,2,6)
	g.addEdge(0,3,5)
	g.addEdge(0,3,15)
	g.addEdge(0,3,4)

	g.KruskalsMST()