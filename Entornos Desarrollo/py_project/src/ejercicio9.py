contrasenia = "usuario"

intento = input("introduce la contraseña: ")

while(contrasenia != intento):
    print("Contraseña incorrecta!")
    intento = input("Introduce la contraseña: ")

print("Contraseña correcta!!, la contraseña era: usuario")