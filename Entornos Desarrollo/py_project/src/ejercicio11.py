palabra = input("Introduce una palabra: ")
invertida = palabra[::-1]
print("Palabra al revés: ", invertida)

for letra in reversed(palabra):
    print(letra)