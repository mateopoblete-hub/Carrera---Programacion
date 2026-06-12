"""
operadoA = 8
operadoB = 5
suma = operadoA + operadoB

#print("El resultado de la suma es: ", suma)
print(f"El resultado de la suma es: {suma}")

resta = operadoA - operadoB
print(f"El resultado de la resta es: {resta}")

multiplication = operadoA * operadoB
print(f"El resultado de la multiplication es: {multiplication}")

division = operadoA / operadoB
print(f"El resultado de la division es: {division}")
division = operadoA // operadoB
print(f"El resultado de la division (int) es: {division}")
modulo = operadoA % operadoB
print(f"El resultado de la division o residue (modulo) es: {modulo}")
exponente = operadoA ** operadoB
print(f"El resultado del exponente es: {exponente}")
"""
"""
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ", area)
print("Perimetro: ", perimetro)
"""
"""
miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

#miVariable3 = miVariable - 2
miVariable3 -= 2
print(miVariable3)

#miVariable3 = miVariable3 * 2
miVariable3 *= 3
print(miVariable3)

#miVariable = miVariable / 2
miVariable3 /= 2
print(miVariable3)
"""
"""
# Operaciones de comparacion

d = 4
b = 6
resultado = d == b #Comprobamos si son iguales
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador mayor que
resultado = d > b
print(resultado)

# Operador menor que
resultado = d < b
print(resultado)

# Operador menor o igual que
resultado = d <= b
print(resultado)

# Operador mayor o igual que
resultado = d >= b
print(resultado)
"""
"""
a = int(input("Digite un numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de ´a´ es: {a} es un numero Par")
else:
    print(f"El valor de ´a´ es: {a} es un numero IMPAR")
"""
"""
edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} años, usted es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} años, usted es menor de edad")
"""
"""
# Operadores logicos

a = True
b = True
resultado = a and b
print(resultado)

# Operadores or
resultado = a or b
print(resultado)

# Operadores not
resultado = a and b
print(resultado)
"""
"""
# Ejercicio: Valor dentro de un rango
valor = int(input("Digite un numero que este dentro del rango de 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")
else:
    print(f"El valor {valor} no esta dentro del rango")
"""
"""
# Ejercicio con el operador or, Operador not
vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print("Puede asistir al juego")
"""
"""
# Ejercicio : Rango entre 20 y 30 años
edad = int(input("Digite su edad: "))
#veinte = edad >= 20 and edad <= 30
#print(veinte)

#treinta = edad >= 30 and edad < 40
#print(treinta)

#if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40):# Sintaxis simplification del operator and
    print("Estas dentro del rango de los (20'0) a (30'0) años")
#    if veinte:
#       print("Estas dentro del rango de los (20\'0) a (30\'0) años")
#    elif treinta:
#       print("Estas dentro del rango de los (30\')0) años")
#    else:
#        print("No estas dentro del rango")
else:
     print("No estas dentro del rango de los (20\'0) a (30\'0) años")
"""
"""
# Ejercicio: El mayor de los numeros
numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("Digite el valor para el numero2: "))

if numero1 > numero2:
    print("El numero 1 es mayor")
else:
    print("El numero 2 es mayor")
"""

# Ejercicio: Tienda de libros
print("Digite los siguientes datos del libro")
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Digite si el envio es gratuito (True/False): ")

if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
print(f'''
        Nombre: {nombre}
        ID: {id}
        precio: {precio}
        Envio Gratuito: {envioGratuito}
''')


