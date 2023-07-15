def selectionSort(A):
    n = len(A)
    for i in range(n-1):
        min = i
        for j in range((i+1),n):
            if(A[min] > A[j]):
                min = j
        temp = A[i]
        A[i] = A[min]
        A[min] = temp

B = []

for i in range(5):
    a = int(input("Enter numbers for array : "))
    B.append(a)

selectionSort(B)
print(B)



