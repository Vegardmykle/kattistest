a = input()
forrige = ""
svar = 0
for bok in a:
    if bok == forrige and bok == "s":
        svar = 1
    forrige = bok

if svar ==0:
    print("no hiss")
else: 
    print("hiss")