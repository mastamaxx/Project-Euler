goal = 200
coins = [1, 2, 5, 10, 20, 50, 100, 200]
combos = [1] + [0]*goal

for coin in coins:
    for i in range(coin, goal+1):
        combos[i] += combos[i-coin]

print(combos[goal])
for i in range(0, len(combos)):
    print(str(i) + " " + str(combos[i]))