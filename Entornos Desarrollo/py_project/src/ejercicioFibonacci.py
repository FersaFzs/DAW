def fibonacci(n: int) -> int:
    secuencia = []
    a, b = 0, 1

    for i in range(n):
        secuencia.append(a)
        a, b = b, a + b
    return secuencia

v = int(input("Introduce un numero: "))
print(fibonacci(v))    