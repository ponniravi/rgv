o=input()
l=list(o)
for i in range(l,len(1),2):
			l[i],l[i+1]=l[i+1],l[i]
print("".join(l))
