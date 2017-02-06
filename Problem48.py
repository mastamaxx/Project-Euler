selfPowers = 0

for x in range(1,1000):
    selfPowers += x ** x

answer = selfPowers%(10**10)

print(answer)