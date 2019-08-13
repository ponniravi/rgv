c,k=map(int,input().split())
t=list(map(int,input().split()))
z=0
u=0
q=0
for i in range(len(t)):
	if t[i]>z:
		z=t[i]
while q<k-t:
	u=0
	for i in range(len(t)):
		if t[i]>u and t[i]<z:
			u=t[i]
			
	z=u
	q+=t
print(z)
