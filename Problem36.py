def toBinary(num):
    digit = 0
    binary = 0
    digitValue = 1

    while num > 0:
        remainder = num % (digitValue * 2)

        if remainder != 0:
            binary += 10**digit
            num = num - digitValue

        digit += 1
        digitValue *= 2


    return binary


def isPalindrome(string):
    return string == string[::-1]

answer = 0

for i in range (0,1000000):
    if isPalindrome(str(i)) and isPalindrome(str(toBinary(i))):
        answer += i

print(answer)


