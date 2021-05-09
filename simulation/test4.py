n,m = map(int, input().split())

check = [ [False] * m for _ in range(n)]
x, y, dir = map(int, input().split())
check[x][y]=True

arr=[]
for i in range(n):
	arr.append(list(map(int, input().split())))

dx=[0,-1,0,1]
dy=[-1,0,1,0]
turn=0
count=1
while True:
	if dir == 4 :
		dir=0
	
	if check[x+dx[dir]][y+dy[dir]]==False and arr[x+dx[dir]][y+dy[dir]] ==0 :
		x= x+dx[dir]
		y= y+dy[dir]
		count+=1
		turn=0
		check[x][y]=True
		continue
	else :
		turn+=1
		dir+=1
	

	if turn==4:
		if arr[x-dx[dir]][y-dy[dir]] == 1:
			break
		else :
			x = x-dx[dir]
			y = y-dy[dir]
			turn = 0



print(count)

