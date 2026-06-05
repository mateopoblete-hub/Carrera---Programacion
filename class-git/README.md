# CLASE 1 - MIÉRCOLES 15 DE ABRIL DE 2026 - Git Bash

### Lo que vimos en la clase anterior

Abrimos la terminal de Git Bash en Windows, la terminal de Ubuntu o la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios.

```bash
pwd
# Vemos la ruta de la carpeta en la que estamos

cd
# Es para navegar a una carpeta: Change Directory (cambiar de directorio)

cd /
# Nos lleva al home o a la raíz del disco

cd ~
# La virgulilla significa que estamos en la carpeta del usuario

ls
# Lista los archivos y carpetas

ls -al
# Muestra todos los archivos, incluidos los ocultos

# Usar la flecha hacia arriba muestra el último comando utilizado

ls -l
# Muestra los archivos en formato lista

ls -a
# Muestra todos los archivos, incluidos los ocultos

clear
# Limpia la consola (también Ctrl + L)

cd ..
# Nos devuelve a la carpeta anterior

cd U + Tab
# Autocompleta nombres de carpetas o archivos

cd /D
# Cambia de disco en Windows

df -h
# Muestra información de los discos en Ubuntu

cd /mnt/d
# Cambia al disco D usando WSL Ubuntu en Windows
```

---

## Creación de carpetas

Lo vamos a hacer juntos desde Zoom.

```bash
cd ..

cd ..

cd /mnt/c

cd ~
# Vamos a la raíz

mkdir Tecnicatura
# En Windows las mayúsculas no tienen relevancia, pero sí en Linux

cd Tecnicatura

mkdir Python

mkdir Java

mkdir JavaScript
```

# CLASE 2 - MIÉRCOLES 22 DE ABRIL DEL 2026 - Git Bash

## Archivos y comandos básicos

Abrir Git Bash en Windows o la terminal de Linux o de Mac. Al abrir Git Bash hacerlo como administrador.

```bash
touch vacio.txt
# Crea un archivo con su extensión

Ctrl + S
# Guardamos lo que escribimos en el archivo

./
# Significa la carpeta actual

../
# Significa la carpeta anterior

cat vacio.txt
# Vemos el contenido del archivo

history
# Veremos la historia completa de los comandos que hemos utilizado

!72 + Enter
# Ejecuta el comando que utilizamos en ese número

history -c
# Borra todos los comandos guardados

rm vacio.txt
# Borra el archivo seleccionado (¡CUIDADO!)

rm --help
# Muestra cómo funciona el comando
```

---

## Crear un repositorio Git y realizar el primer commit

```bash
cd tecnicatura

mkdir class-git

cd class-git
# Entramos en la carpeta donde vamos a trabajar

git init
# Creamos un repositorio en la carpeta actual. Se crea la carpeta oculta .git
```

> IMPORTANTE: Si el repositorio ya está creado, no se debe volver a ejecutar este comando.

```bash
code .
# Abrimos Visual Studio Code en la carpeta actual

Ctrl + N
# Creamos un archivo nuevo

Ctrl + S
# Guardamos el archivo con el nombre: historia.txt

git status
# Vemos el estado del proyecto en tiempo real

git add historia.txt
# Enviamos el archivo al área de preparación

git status
# Verificamos el estado de los cambios

git rm --cached historia.txt
# Quitamos el archivo del área de preparación
```

---

## Configuración de Git

```bash
git config
# Muestra las opciones de configuración

git config --list
# Muestra las configuraciones actuales

git config --list --show-origin
# Muestra dónde están guardadas las configuraciones
```

> IMPORTANTE: Si las configuraciones ya están hechas, no es necesario volver a realizarlas.

```bash
git config --global user.name "Ariel Betancud"

git config --global user.email "betancudariel@gmail.com"
# El correo debe ser el mismo que utilizaremos en GitHub

git config --list
# Verificamos que los datos se hayan guardado correctamente
```

---

## Primer Commit

```bash
git add .
# Agregamos todos los archivos al área de preparación

git commit -m "Mensaje importante del commit"
# Realizamos el primer commit
```

---

## Segundo Commit

```bash
code .
# Realizamos cambios en el archivo y guardamos

git status
# Verificamos que hay cambios para guardar

git add .

git commit -m "Mi segundo commit"
```

---

## Historial de Commits

```bash
git log historia.txt
# Vemos toda la historia de este archivo
# El número largo que aparece es el hash del commit
```

# CLASE 3 - MIÉRCOLES 29 DE ABRIL DEL 2026 - Git Bash

## Analizar cambios en los archivos de tu proyecto Git - Parte 3

Ingresamos de la siguiente manera:

Abrir Git Bash en Windows o la terminal de Linux o de Mac. Al abrir Git Bash hacerlo como administrador. En Linux también se puede utilizar `sudo` para permisos especiales.

```bash
cd tecnicaturagit
# Ingresamos al directorio donde están nuestras carpetas de trabajo

ls
# Vemos los archivos y directorios que ya tenemos

cd git
# No hay nada

cd ..
# Salimos

rm historia.txt
# Eliminamos el archivo que habíamos creado anteriormente (práctica)

rm Git
# Error: Git es un directorio

rm --recursive -R Git
# Elimina un directorio y todo su contenido (práctica)

rm --help
# Muestra la documentación y ayuda del comando rm
```

---

## Creación del directorio de trabajo

```bash
mkdir class-git
# Creamos la carpeta o directorio para trabajar en Git local

cd class-git
# Entramos en la carpeta para crear el README.md

touch README.md
# Creamos un archivo Markdown
```

### ¿Qué es Markdown?

Markdown es un lenguaje de marcado ligero que permite dar formato al texto de manera sencilla. GitHub lo utiliza para los archivos `README.md`, transformando automáticamente el contenido a HTML.

Consultar la documentación oficial de GitHub sobre Markdown.

---

## Edición del README

```bash
code .
# Abrimos Visual Studio Code para editar el archivo
```

Comenzamos a cargar en el `README.md` todo lo visto en las clases anteriores (comandos y prácticas realizadas).

---

## Guardar cambios en Git

```bash
git status
# Verificamos el estado del proyecto

git add .
# Agregamos todos los cambios al área de preparación

git status
# Verificamos nuevamente el estado

git commit -m "Cargamos el README dentro del directorio class-git"
# Guardamos los cambios en un commit

git status
# Comprobamos que no haya cambios pendientes

git log
# Vemos el historial de commits realizados
```

> Si tienes cargadas clases anteriores, verás más commits de los que aparecen en el ejemplo del profesor.

---

## Salir de los directorios

```bash
cd ..

cd ..
```

# CLASE 4 - MIÉRCOLES 6 DE MAYO DEL 2026 - Git Bash

## Analizar cambios en los archivos de tu proyecto Git - Parte 4

Ingresamos de la siguiente manera:

Abrir Git Bash en Windows o la terminal de Linux o de Mac. Al abrir Git Bash hacerlo como administrador. En Linux también se puede utilizar `sudo` para permisos especiales.

> TAREA: Agregar comentarios en los comandos para saber qué hace cada uno.

```bash
cd tecnicatura
# Ingresamos al directorio principal de trabajo

cd class-git
# Entramos en la carpeta del proyecto Git

ls
# Mostramos los archivos y carpetas del directorio actual

touch historia.txt
# Creamos un archivo llamado historia.txt

code .
# Abrimos Visual Studio Code en la carpeta actual
```

---

## Modificar el archivo historia.txt

Dentro de Visual Studio Code escribir:

```text
Bienvenido, mi nombre es Ariel
```

> Reemplazar "Ariel" por tu nombre.

```bash
Ctrl + S
# Guardamos los cambios realizados

git status
# Verificamos el estado actual del proyecto

git add .
# Agregamos todos los cambios al área de preparación

git status
# Verificamos nuevamente el estado

git commit
# Realizamos un commit sin usar -m para abrir el editor de texto Vim
```

---

## Salir de Vim y guardar el mensaje del commit

```bash
Esc
# Salimos del modo edición

:wq! + Enter
# Guardamos y salimos de Vim en Git Bash para Windows

Esc + Shift + Z + Z
# Guardamos y salimos en algunas terminales Linux
```

---

## Realizar nuevos cambios

Agregar una nueva línea en `historia.txt`:

```text
Estoy estudiando programación
```

```bash
Ctrl + S
# Guardamos el archivo

git add .
# Agregamos los cambios al área de preparación

git commit
# Se abre nuevamente el editor Vim
```

---

## Comandos útiles dentro de Vim

```bash
Esc + i
# Entramos en modo inserción para escribir

Ctrl + X
# Salir en algunas distribuciones Linux

s + Enter
# Confirmar cambios y aceptar el nombre del archivo en Linux
```

---

## Ver cambios y el historial

```bash
git show
# Muestra todos los cambios realizados en el último commit

git log historia.txt
# Muestra el historial de commits del archivo historia.txt

q
# Salimos del historial de commits
```

---

## Comparar commits

Copiamos un hash antiguo y uno más reciente, luego ejecutamos:

```bash
git diff hash_commit_antiguo hash_commit_reciente
# Compara los cambios entre dos commits
# Primero se coloca el hash más antiguo y luego el más reciente

q
# Salimos de la comparación
```

---

## Salir de los directorios

```bash
cd ..
# Volvemos al directorio anterior

cd ..
# Volvemos al directorio superior
```

# CLASE 5 - MIÉRCOLES 13 DE MAYO DEL 2026 - Git Bash

## ¿Qué es el Staging?

Tenemos una carpeta o directorio donde se encuentran los archivos de nuestro proyecto, por ejemplo `historia.txt`.

Cuando ejecutamos:

```bash
git init
```

Git crea un repositorio local y una carpeta oculta llamada `.git`, donde se almacenará el historial completo del proyecto.

Dentro del funcionamiento de Git existen tres áreas principales:

### Área de trabajo (Working Directory)

Es donde se encuentran los archivos que estamos creando o modificando.

### Área de preparación (Staging Area)

Es una zona temporal donde colocamos los cambios antes de guardarlos definitivamente en el repositorio.

Cuando ejecutamos:

```bash
git add historia.txt
```

o

```bash
git add .
```

los cambios pasan al área de preparación (staging).

### Repositorio (Repository)

Cuando realizamos:

```bash
git commit -m "Mensaje"
```

los cambios pasan desde el área de preparación al repositorio Git.

Cada commit genera un identificador único llamado **hash**, compuesto por letras y números, que permite identificar cada versión del proyecto.

---

## Flujo básico de Git

```text
Área de Trabajo
       │
       ▼
git add
       │
       ▼
Staging (Área de Preparación)
       │
       ▼
git commit
       │
       ▼
Repositorio Git (.git)
```

---

## ¿Qué es Gitflow?

Gitflow es un modelo de trabajo basado en ramas para organizar el desarrollo de proyectos utilizando Git.

Fue propuesto y popularizado por Vincent Driessen.

Este modelo utiliza ramas principales y ramas auxiliares para mantener el desarrollo organizado y reducir errores al integrar cambios.

---

## ¿Qué es una Branch (Rama)?

Una rama o **branch** es una línea independiente de desarrollo.

La rama principal suele llamarse:

```text
master
```

o en proyectos más recientes:

```text
main
```

Cada commit genera una nueva versión dentro de esa rama.

Las ramas permiten trabajar en nuevas funcionalidades sin afectar el código principal.

---

## ¿Qué es un Merge?

Un **merge** es el proceso de unir los cambios realizados en una rama con otra.

Por ejemplo:

```text
master
   │
   ├── develop
   │
   └── hotfix
```

Cuando los cambios fueron probados y funcionan correctamente, se realiza un merge para incorporarlos a la rama principal.

---

## Ramas principales en Gitflow

### Master o Main

Contiene las versiones estables del proyecto.

No se recomienda trabajar directamente sobre esta rama.

### Develop

Contiene el desarrollo principal del proyecto.

Desde aquí suelen crearse las ramas auxiliares.

---

## Ramas auxiliares

### Feature

Se utiliza para desarrollar nuevas funcionalidades, requisitos o historias de usuario.

Ejemplo:

```text
feature/login
feature/carrito-compras
feature/perfil-usuario
```

### Release

Se utiliza para preparar una nueva versión antes de ser publicada.

Permite realizar pruebas, correcciones y ajustes finales.

### Hotfix

Se utiliza para corregir errores críticos detectados en producción.

Permite solucionar problemas urgentes sin esperar un nuevo ciclo de desarrollo.

---

## Importancia de evitar cambios directos en Master

Realizar commits directamente en la rama principal puede generar errores en producción.

Por este motivo, la práctica recomendada es:

1. Crear una rama auxiliar.
2. Desarrollar y probar los cambios.
3. Realizar un merge cuando todo funcione correctamente.

Esto reduce el riesgo de introducir errores en el proyecto principal.

---

## Conflictos durante un Merge

Podemos crear tantas ramas como sea necesario.

Sin embargo, al unir cambios de diferentes ramas pueden surgir conflictos.

Un conflicto ocurre cuando dos ramas modifican la misma parte de un archivo y Git no puede decidir cuál cambio conservar.

Estos conflictos deben resolverse manualmente antes de completar el merge.

---

## Conceptos importantes

- **Repositorio:** Lugar donde Git guarda el historial del proyecto.
- **Staging:** Área temporal donde se preparan los cambios.
- **Commit:** Registro de una versión del proyecto.
- **Hash:** Identificador único de un commit.
- **Branch:** Rama independiente de desarrollo.
- **Merge:** Unión de cambios entre ramas.
- **Feature:** Rama para nuevas funcionalidades.
- **Release:** Rama para preparar versiones.
- **Hotfix:** Rama para corregir errores críticos.
- **Conflicto:** Problema que ocurre al unir cambios incompatibles.


# CLASE 6 - MIÉRCOLES 20 DE MAYO DEL 2026

## Volver en el tiempo en nuestro repositorio utilizando Reset y Checkout - Parte 6

Ingresamos de la siguiente manera:

Abrir Git Bash en Windows o la terminal de Linux o de Mac. Al abrir Git Bash hacerlo como administrador. En Linux también se puede utilizar `sudo` para permisos especiales.

> TAREA: Agregar comentarios en los comandos para saber qué hace cada uno.

```bash
cd tecnicatura
# Ingresamos al directorio principal de trabajo

cd class-git
# Entramos en la carpeta del proyecto

ls
# Mostramos los archivos y carpetas existentes

touch historia.txt
# Creamos el archivo historia.txt si no existe

cd ..
# Volvemos al directorio anterior

code .
# Abrimos Visual Studio Code y realizamos cambios en historia.txt
```

---

## Crear un Commit utilizando Vim

```bash
git commit -a
# Agrega automáticamente los archivos ya versionados y abre Vim para escribir el mensaje del commit

Esc + i
# Entramos en modo inserción para escribir el mensaje

Esc
# Salimos del modo inserción

:wq!
# Guardamos y salimos del editor Vim
```

---

## Ver historial de commits

```bash
git log
# Muestra todos los commits realizados hasta el momento

git show
# Muestra información detallada del último commit

git log --oneline
# Muestra el historial resumido con hashes cortos
```

Copiar el hash del commit que deseamos utilizar.

---

## Utilizando Git Reset

```bash
git reset hash-del-commit
# Regresa a una versión anterior del proyecto
```

Existen dos tipos principales de reset:

### Reset suave (Soft)

```bash
git status
# Verificamos que los cambios siguen en el área de trabajo

git add .
# Volvemos a preparar los cambios

git commit -m "Agregamos datos de estudios en historia.txt"
# Realizamos nuevamente el commit
```

```bash
git config --list
# Verificamos la configuración de Git

git log --oneline
# Copiamos nuevamente un hash
```

### Reset duro (Hard)

```bash
git reset --hard hash
# Todo vuelve al estado exacto de ese commit
# Los cambios posteriores desaparecen
```

> Es el método más utilizado, pero también el más peligroso porque elimina cambios.

---

## Continuar trabajando después de un Reset

Crear, modificar y commitear nuevamente el archivo `historia.txt`.

```bash
git reset --soft hash
# Regresa a un commit anterior manteniendo los cambios en staging
```

```bash
git diff
# Muestra las diferencias entre los archivos en memoria y en disco
```

```bash
git add .
# Agregamos todos los cambios al staging

git status
# Verificamos el estado actual

git commit -m "Commiteamos lo último de hoy"
# Guardamos los cambios
```

```bash
git log
# Vemos el nuevo historial sin los commits eliminados por reset --hard
```

---

## Analizar cambios en archivos

Modificar la última línea de `historia.txt` y guardar.

```bash
Ctrl + S
# Guardamos los cambios

git diff
# Visualizamos las diferencias realizadas
```

Agregar nuevamente cambios al archivo.

```bash
git commit -am "Cambio en la última línea del historia.txt"
# Agrega y realiza el commit de archivos ya versionados
```

```bash
git log
# Visualizamos el historial actualizado

q
# Salimos del historial
```

---

## Ver estadísticas de cambios

```bash
git log --stat
# Muestra los archivos modificados y cantidad de cambios realizados

q
# Salimos de la visualización
```

---

## Utilizando Git Checkout

Copiamos el hash del primer commit.

```bash
git checkout hash
# Visualizamos el proyecto exactamente como estaba en ese commit
```

```bash
git status
# Verificamos el estado actual
```

```bash
git checkout master
# Volvemos a la rama principal
```

También podemos volver a un commit específico:

```bash
git checkout hash
# Regresamos a una versión anterior para revisarla o modificarla
```

Realizamos cambios y luego:

```bash
git commit -am "Reemplazo de una versión por otra de la historia"
# Guardamos los cambios realizados
```

```bash
git log
# Observamos el nuevo commit generado
```

> Se recomienda utilizar esta técnica para recuperar versiones funcionales y corregir errores detectados posteriormente.

---

## Creación y manejo de ramas

```bash
git branch cambios
# Creamos una nueva rama llamada cambios
```

```bash
git checkout master
# Regresamos a la rama principal
```

Por esta razón se recomienda trabajar con ramas secundarias y no directamente sobre las ramas principales.

Las ramas principales suelen ser:

```text
master o main
develop
```

Crear ramas de trabajo:

```bash
git branch second
# Creamos una rama llamada second

git branch tuNombre
# Creamos una rama con nuestro nombre

git branch hotfix
# Creamos una rama para correcciones urgentes
```

```bash
git branch
# Mostramos todas las ramas existentes
```

---

## Eliminar ramas

```bash
git branch -d cambios
# Eliminamos la rama cambios si ya fue fusionada
```

Si Git no permite eliminarla:

```bash
git branch -D cambios
# Fuerza la eliminación de la rama
```

---

## Salir de los directorios

```bash
cd ..
# Volvemos al directorio anterior

cd ..
# Volvemos al directorio superior
```