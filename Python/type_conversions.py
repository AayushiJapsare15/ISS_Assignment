# 1. Upcasting (Implicit Type Conversion)
# Upcasting is the conversion of a lower data type to a higher data type automatically by Python

a = 10        # int
b = 2.5       # float
c = a + b
print(type(c)) #<class 'float'>

# 2. Downcasting (Explicit Type Conversion)
# Downcasting is the conversion of a higher data type to a lower data type manually by the programmer
x = 12.9      # float
y = int(x)
print(type(y)) #<class 'int'>