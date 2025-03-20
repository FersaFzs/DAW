nBinario = []

n = int(input("Introduce un numero entero: "))

while n > 0:
    nBinario.insert(0, n % 2)
    n //= 2

print(nBinario)


def Binary2Decimal(n_bin: bin) -> bin:
    decimal = 0
    power = 0

    while n_bin > 0:
        remainder = n_bin % 10
        decimal += remainder * (2 ** power)
        n_bin //= 10
        power += 1

    return decimal


print(Binary2Decimal(11011))