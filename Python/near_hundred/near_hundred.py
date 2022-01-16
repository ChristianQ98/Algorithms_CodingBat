# Given an int n, return True if it is within 10 of 100 or 200. Note: abs(num) computes the absolute value of a number.

# near_hundred(93) → True
# near_hundred(90) → True
# near_hundred(89) → False

def near_hundred(n):
    # First checks if the absolute difference of n and 100 is less than or equal to 10, meaning it is within 10 of 100
    # Second checks if the absolute difference of n and 200 is less than or equal to 10, meaning it is within 10 of 200
    return abs(n - 100) <= 10 or abs(n - 200) <= 10

print(near_hundred(93))
print(near_hundred(90))
print(near_hundred(89))