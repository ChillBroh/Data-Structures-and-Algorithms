def recursive_func(num):
    if num == -1:
        print("Output: Finished")
        return
    else:
        output = num * num - num + 2
        print("Output:", output)
        num = int(input("Enter number: "))
        recursive_func(num)

num = int(input("Enter number: "))
recursive_func(num)
