# 1. If–Else Statement
# Used to make decisions based on conditions.

age = 19

if age >= 18:
    print("Eligible to vote")
else:
    print("Not eligible")

# 2. For Loop
# Used to iterate over a sequence (list, tuple, string, range).

for i in range(1, 6):
    print(i)

for i in "iuhgfdsxcvbn":
    print(i)

# 3. While Loop
# Repeats a block of code as long as a condition is True.

i = 1
while i <= 5:
    print(i)
    i += 1

# 4.Break
# Stops the loop immediately.

for i in range(1, 6):
    if i == 3:
        break
    print(i)

# 5. Continue
# Skips the current iteration and moves to the next one.

for i in range(1, 6):
    if i == 3:
        continue
    print(i)

# 6. Pass Statement
# Used as a placeholder when a statement is required syntactically but no action is needed.
# Python does not allow empty blocks.
# So pass prevents syntax errors when you want to write code later.
for i in range(5):
    if i == 3:
        pass
    print(i)

# 7. Loop–Else
# The else block executes only if the loop completes normally (without break).

for i in range(1, 6):
    if i == 7:
        break
else:
    print("Loop completed successfully")