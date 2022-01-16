# Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

# diff21(19) → 2
# diff21(10) → 11
# diff21(21) → 0

def diff21(n):
    # If n is greater than 21
    if n > 21:
    # Return double the absolute difference between n and 21
        return (n - 21) * 2
    # If n is less than 21
    else:
        # Return the absolute difference between n and 21
        return 21 - n

print(diff21(19))
print(diff21(10))
print(diff21(21))