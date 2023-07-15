
def insertionSort(A):
    n = len(A)
    print(n)
    for i in range(1,n):
        current = A[i]
        j = i - 1
        while j >= 0 and A[j] > current:
            A[j+1] = A[j]
            j -= 1
        A[j+1] = current
        
B = []
while True:

    a = int(input("Enter Number Betnween 10 - 20 : ") )
    if(a == -1):
        print("Exit")
        break
    if 10 <= a <= 20:
        B.append(a)      
    else :
        print("Enter Number between 10 to 20")


insertionSort(B) 
print(B)





    
