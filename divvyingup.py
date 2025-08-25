ant = int(input())
pris = input().split(" ")
sume = map(int, pris)


sjekk = sum(sume)%3

if sjekk ==0:
    print("yes")
else: print("no")
