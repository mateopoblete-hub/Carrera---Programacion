"""
# Intercambiar el valor de dos variables

a = 10
b = 5

print("Antes del intercambio: ", "a =", a, "y","b =", b )

a, b = b, a

print("Despues del intercambio", "a =", a, "y","b =", b )
"""
# Calcular estacion del año
# Grupal
mes = int(input("Ingrese algun mes del año (del 1 al 12): "))

if mes == 1 or mes == 2 or mes == 3:
    print("Verano")
elif mes == 4 or mes == 5 or mes == 6:
    print("Otoño")
elif mes == 7 or mes == 8 or mes == 9:
    print("Invierno")
elif mes == 10 or mes == 11 or mes == 12:
    print("Primavera")
else:
    print("El numero de mes ingresado no existe ")










