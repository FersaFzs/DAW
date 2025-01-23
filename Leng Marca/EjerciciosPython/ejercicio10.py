ingredientes_veg = ["Pimiento", "Tofu"]
ingredientes_noveg = ["Peperoni", "Jamón", "Salmón"]
ingredientes_fijos = ["Tomate", "Mozzarella"]

def print_menu(entrada, lista):
     print("Es " + entrada + ", el menú disponible es: ")
     for i in range(len(lista)):
          print(lista[i] + " ("+ str(i)+")")

def print_ingredients_ordered(ing_fijos, extra):
     print("Su pizza contendrá: ")
     for ing in ing_fijos:
          print(ing, end=" ")
     print(extra)

print("PIZZERIA")
entrada = input("Quieres la pizza vegetariana? S/N\n")
while entrada != "S" and entrada != "N":
    is_veg = input("Quieres la pizza vegetariana? S/N")

if(entrada=="S"):
    num = print_menu("vegetariano", ingredientes_veg)
    print_ingredients_ordered(ingredientes_fijos, ingredientes_veg[num])
    
else: 
     num=print_menu("no vegetariano", ingredientes_noveg)
     print_ingredients_ordered(ingredientes_fijos, ingredientes_noveg[num])
    