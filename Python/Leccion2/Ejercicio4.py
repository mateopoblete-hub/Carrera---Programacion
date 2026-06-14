"""
# Area de longitud de un circulo

radio = float(input("Ingrese el radio del circulo: "))
pi = 3.14159

area = pi * radio ** 2
longitud = 2 * pi * radio

print(f"El area del circulo es {area}")
print(f"El longitud del circulo es {longitud}")
"""

# Etapas de la vida
# Grupal
edad = int(input("Ingrese su edad: "))

if edad >= 0 and edad <= 10:
    print("La infancia es increíble y bella.")
elif edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar.")
elif edad <= 29:
    print("Amor y comienza el trabajo.")
elif edad <= 59:
    print("Etapa adulta, con responsabilidades y experiencias.")
else:
    print("Disfruta de la sabiduría y experiencia de esta edad.")
