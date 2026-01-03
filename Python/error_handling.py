try:
    x = int(input("Enter a number: "))
    print(10 / x)
except ZeroDivisionError:
    print("Cannot divide by zero")
except ValueError:
    print("Invalid input")

# 2. Else and Finally
# else Executes only if no exception occurs.

try:
    a = 10
    b = 2
    print(a / b)
except ZeroDivisionError:
    print("Error")
else:
    print("Division successful")

# finally Executes always, whether an exception occurs or not.

try:
    file = open("data.txt", "r")
except FileNotFoundError:
    print("File not found")
finally:
    print("Program finished")

# Raise Statement
# Used to manually trigger an exception.

age = -5
if age < 0:
    raise ValueError("Age cannot be negative")