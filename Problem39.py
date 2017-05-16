import math

def is_int(value):
    if type(value) == int:
        return True
    else:
        if value.is_integer():
            return True
        else:
            return False

perimeter = [0]*1001

for a in range (1, 333):
    for b in range (a, 999):
        try:
            c = math.sqrt(a*a + b*b)
        except:
            c = 0.1

        if a + b + c > 1000:
            break

        if is_int(c):
            perimeter[a + b + int(c)] += 1

maxIndex = 0
maxTriangles = 0

for i in range (1, 1001):
    if perimeter[i] > maxTriangles:
        maxTriangles = perimeter[i]
        maxIndex = i

print(maxIndex)

