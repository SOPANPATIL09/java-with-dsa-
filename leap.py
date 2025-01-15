def is_prime(n):
    # Check if n is less than or equal to 1
    if n <= 1:
        return False
    # Iterate from 2 to the square root of n
    for i in range(2, int(n**0.5) + 1):
        # Check if n is divisible by i
        if n % i == 0:
            return False
    return True

# Example usage
number = int(input("Enter a number: "))
# Check if the number is prime and print the result
if is_prime(number):
    print(f"{number} is a prime number.")
else:
    print(f"{number} is not a prime number.")