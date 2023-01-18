def check(array):
    if (sorted(array) == array):
        print ("ascending")
    elif (sorted(array, reverse=True) == array):
        print ("descending")
    else:
        print ("mixed")

array = input()
array = array.split()
check(array)