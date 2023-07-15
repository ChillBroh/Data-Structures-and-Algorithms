A = []
for i in range(8):
    A.append(int(input("Enter number for Array : ")))
print(A)

def bubbleSort(A):
    n = len(A)
    #no need to check last one cause inner forloop set last one as highest
    for i in range(n-1):
        #n-i will prevent code check all the elements every time. cause each and evry iterations will replace last with the largest value 
        for j in range(1,n-i):
            if A[j] < A[j-1]:
                A[j], A[j-1] = A[j-1], A[j]

bubbleSort(A)
print("Sorted Array:", A)
