def greet():
    print("Hello","world")

greet()

# Parameters

def add(a, b):   # a and b are parameters
    print(a + b)

# Arguments
add(5, 3)   # 5 and 3 are arguments

add(10, 20) #Positional arguments
add(a=10, b=20) #Keyword arguments

# Return Statement
def square(n):
    return n * n

result = square(4)
print(result)
# *args (Non-keyword Arguments)
def total(*args):
    return sum(args)

print(total(1, 2, 3, 4))

# **kwargs (Keyword Arguments)
def func(**kwargs):
    for key,value in kwargs.items():
        print(key, value)

func(name="Ayushi", age=20, branch="CE")

