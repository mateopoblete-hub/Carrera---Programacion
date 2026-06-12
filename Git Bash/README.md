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


# CLASE 6 - MIÉRCOLES 20 DE MAYO DEL 2026 - Git Bash

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

# CLASE 7 - MIÉRCOLES 27 DE MAYO DEL 2026 - Git Bash

## Git Reset vs Git RM - Parte 7

Los comandos `git reset` y `git rm` tienen utilidades muy diferentes, pero pueden confundirse fácilmente.

---

## Git Reset

El comando `git reset` es una herramienta poderosa que permite deshacer o revertir cambios en un repositorio Git.

Puede ejecutarse de tres maneras principales:

```bash
git reset --soft
git reset --mixed
git reset --hard
```

A diferencia de `git checkout`, que nos permite ir a una versión anterior, revisarla y volver, `git reset` modifica la historia del repositorio. Cuando usamos reset, estamos eliminando parte de la historia y sobrescribiéndola.

> Con git checkout podemos viajar al pasado y regresar.  
> Con git reset volvemos al pasado y reescribimos la historia.

---

## Los tres árboles de Git

Para entender Git Reset es importante conocer las tres áreas principales de Git:

### Working Directory (Área de trabajo)

Es donde se encuentran los archivos que estamos editando.

### Staging Area (Área de preparación)

Es la zona temporal donde se preparan los cambios antes de realizar un commit.

### Repository (Repositorio)

Es donde Git almacena permanentemente los commits.

```text
Working Directory
        │
        ▼
    git add
        │
        ▼
 Staging Area
        │
        ▼
   git commit
        │
        ▼
   Repository
```

---

## Ingresamos de la siguiente manera

Abrir Git Bash en Windows o la terminal de Linux o Mac.

Al abrir Git Bash hacerlo como administrador. En Linux también se puede utilizar `sudo` para permisos especiales.

> TAREA: Agregar comentarios en los comandos para saber qué hace cada uno.

---

## Práctica de Git Reset

```bash
cd tecnicatura
# Vamos al directorio principal de trabajo

cd practicas
# Entramos en la carpeta donde realizaremos pruebas

touch reset_file.txt
# Creamos un archivo para experimentar con Git Reset
```

Agregar información al archivo y realizar uno o dos commits.

```bash
git add reset_file.txt
# Agregamos el archivo al área de preparación

git add .
# Agregamos todos los archivos modificados

git commit -m "Iniciando el primer commit"
# Creamos el primer commit
```

---

## ¿Cómo funciona Git Reset?

Git Reset permite moverse entre commits para deshacer o rehacer cambios.

Git almacena cada versión del proyecto como una instantánea llamada commit.

---

## Variaciones de Git Reset

### Git Reset Soft

```bash
git reset --soft hash
# Regresa a un commit anterior manteniendo los cambios en staging
```

Características:

- Borra commits posteriores del historial.
- Mantiene los cambios preparados para volver a commitearlos.
- No pierde archivos.

---

### Git Reset Hard

```bash
git reset --hard hash
# Regresa completamente a un commit anterior
```

Características:

- Elimina commits posteriores.
- Elimina cambios del staging.
- Elimina cambios del área de trabajo.
- Es el más peligroso.

---

### Git Reset Mixed

```bash
git reset --mixed hash
# Regresa a un commit anterior eliminando el staging
```

Características:

- Borra los commits posteriores.
- Quita los archivos del staging.
- Conserva los cambios en el área de trabajo.

Es el comportamiento predeterminado de Git Reset.

---

### Git Reset HEAD

```bash
git reset HEAD archivo.txt
# Quita un archivo del área de preparación sin eliminar sus cambios
```

Características:

- Mueve archivos de Staging a Working Directory.
- No elimina información.
- Permite seguir editando antes de commitear.

---

## ¿Qué es Git RM?

Git RM permite eliminar archivos del repositorio.

A diferencia de Git Reset, este comando elimina archivos que ya están siendo rastreados por Git.

---

## Variaciones de Git RM

### Git RM Cached

```bash
git rm --cached archivo.txt
# Elimina el archivo del repositorio pero lo conserva en el disco
```

Características:

- Deja de ser rastreado por Git.
- El archivo continúa existiendo en la computadora.
- Pasa al estado Untracked.

---

### Git RM Force

```bash
git rm --force archivo.txt
# Elimina el archivo del repositorio y del disco duro
```

Características:

- Borra completamente el archivo.
- Git deja de rastrearlo.
- Puede recuperarse utilizando commits anteriores.

---

## Diferencia entre Git RM y Git Reset HEAD

### Git RM

```bash
git rm archivo.txt
```

- Elimina archivos.
- Modifica el contenido del repositorio.
- Puede afectar el historial del proyecto.

### Git Reset HEAD

```bash
git reset HEAD archivo.txt
```

- Solo quita archivos del área de preparación.
- No elimina archivos.
- No afecta el historial del repositorio.

---

## ¿Cuándo utilizar Git Reset en lugar de Git Revert?

### Git Reset

Se utiliza cuando:

- Queremos reescribir la historia.
- Queremos eliminar commits anteriores.
- Estamos trabajando localmente.

### Git Revert

Se utiliza cuando:

- Queremos deshacer cambios sin modificar la historia.
- Trabajamos en proyectos compartidos.
- Necesitamos mantener todos los registros de cambios.

---

## Resumen

### Git RM

```bash
git rm archivo.txt
```

- Elimina archivos de Git.
- Mantiene el historial anterior.
- El archivo desaparece de la versión actual.

### Git Reset HEAD

```bash
git reset HEAD archivo.txt
```

- Quita archivos del staging.
- Mantiene los cambios.
- No elimina archivos.

---

## Siguientes pasos

Crear cambios en el archivo creado.

Realizar varios commits para probar:

```bash
git reset --soft
git reset --mixed
git reset --hard
git reset HEAD
git rm --cached
git rm --force
```

Al finalizar las pruebas:

```bash
cd ..
# Volvemos al directorio anterior

rm -R practicas
# Eliminamos el directorio de pruebas junto con todo su contenido
```

# CLASE 8-A - MIÉRCOLES 3 DE JUNIO DEL 2026 - Git Bash

## Flujo de trabajo básico con un repositorio remoto - Parte 8

Cuando empiezas a trabajar en un entorno local, el proyecto vive únicamente en tu computadora. Esto significa que no hay forma de que otros miembros del equipo trabajen en él.

Para solucionar esto, utilizamos los **servidores remotos**, un nuevo estado que deben seguir nuestros archivos para conectarse y trabajar con equipos de cualquier parte del mundo.

Estos servidores remotos pueden estar alojados en:

- GitHub
- GitLab
- BitBucket

Estos servicios almacenan una copia del repositorio y nos proporcionan una URL para que cualquier integrante del equipo pueda acceder al proyecto.

De esta forma, otros desarrolladores pueden:

- Descargar el proyecto.
- Realizar cambios.
- Subir nuevamente esos cambios.
- Comparar versiones.
- Crear propuestas de mejora.

---

## Comandos para trabajo remoto con Git

### Clonar un repositorio remoto

```bash
git clone url_del_servidor_remoto
# Descarga la última versión del proyecto junto con todo el historial de cambios
```

Este comando crea automáticamente la carpeta `.git` en el repositorio descargado.

---

### Enviar cambios al servidor remoto

```bash
git push
# Envía los commits realizados desde el repositorio local al repositorio remoto
```

Antes de ejecutar este comando debemos realizar:

```bash
git add .
git commit -m "Mensaje del commit"
```

---

### Obtener cambios del servidor remoto

```bash
git fetch
# Descarga los cambios del servidor remoto sin aplicarlos automáticamente
```

Los cambios quedan almacenados localmente para que podamos revisarlos antes de integrarlos.

---

### Combinar cambios

```bash
git merge
# Combina cambios de diferentes ramas o repositorios
```

También se utiliza después de un `git fetch` para incorporar los cambios descargados.

---

### Obtener y combinar cambios automáticamente

```bash
git pull
# Ejecuta git fetch y git merge en un solo paso
```

Es el comando más utilizado para actualizar un repositorio local.

---

# Comandos útiles para proyectos grandes

### Historial resumido

```bash
git log --oneline
# Muestra el hash corto y el mensaje de cada commit
```

---

### Mostrar referencias de ramas y etiquetas

```bash
git log --decorate
# Indica dónde se encuentra el HEAD y otras referencias
```

---

### Ver estadísticas de cambios

```bash
git log --stat
# Muestra los archivos modificados y la cantidad de líneas agregadas o eliminadas
```

---

### Ver cambios detallados

```bash
git log -p
# Muestra exactamente qué cambió dentro de cada commit
```

---

### Ver commits por usuario

```bash
git shortlog
# Agrupa los commits por autor
```

---

### Visualizar gráficamente las ramas

```bash
git log --graph --oneline --decorate --all
# Muestra un gráfico del historial de ramas y commits
```

---

### Limitar la cantidad de commits mostrados

```bash
git log -3
# Muestra solamente los últimos 3 commits
```

---

### Buscar commits por fecha

```bash
git log --after="2018-1-2"
# Muestra commits posteriores a la fecha indicada
```

```bash
git log --after="today"
# Muestra commits realizados desde hoy
```

```bash
git log --after="2018-1-2" --before="today"
# Muestra commits entre dos fechas específicas
```

---

### Buscar commits por autor

```bash
git log --author="Nombre Autor"
# Muestra commits realizados por un autor específico
```

---

### Buscar commits por mensaje

```bash
git log --grep="INVIE"
# Busca commits cuyo mensaje contenga exactamente ese texto
```

```bash
git log --grep="INVIE" -i
# Busca ignorando mayúsculas y minúsculas
```

---

### Buscar commits de un archivo específico

```bash
git log -- index.html
# Muestra el historial de commits de un archivo determinado
```

---

### Buscar commits por contenido

```bash
git log -S "Por contenido"
# Busca commits donde aparezca o desaparezca un texto específico
```

---

### Guardar el historial en un archivo

```bash
git log > log.txt
# Guarda todo el historial de commits en un archivo de texto
```

---

## Resumen

### Trabajo Local

```text
Working Directory
        │
        ▼
     git add
        │
        ▼
     Staging
        │
        ▼
    git commit
        │
        ▼
Repositorio Local
```

### Trabajo Remoto

```text
Repositorio Local
        │
        ▼
     git push
        │
        ▼
Repositorio Remoto
(GitHub, GitLab, BitBucket)
        │
        ▼
     git pull
        │
        ▼
Repositorio Local
```

El flujo básico de trabajo remoto consiste en:

1. Clonar el repositorio.
2. Realizar cambios.
3. Hacer `git add`.
4. Hacer `git commit`.
5. Ejecutar `git push`.
6. Actualizar el proyecto con `git pull`.

#Miercoles 3 de Junio (Parte 2)
## Flujo de trabajo básico con repositorios remotos

Cuando trabajamos únicamente en nuestra computadora, el proyecto existe de forma local. Para compartirlo con otras personas utilizamos repositorios remotos en plataformas como GitHub, GitLab o BitBucket.

Los repositorios remotos permiten descargar proyectos, realizar cambios y compartirlos con otros desarrolladores.

### Comandos básicos para trabajo remoto

```bash
git clone url_del_repositorio
# Descarga un repositorio remoto junto con su historial

git push
# Envía los cambios del repositorio local al repositorio remoto

git fetch
# Descarga actualizaciones del servidor remoto sin aplicarlas

git merge
# Fusiona cambios entre ramas o repositorios

git pull
# Ejecuta git fetch y git merge automáticamente
```

### Comandos útiles para consultar el historial

```bash
git log --oneline
# Muestra los commits de forma resumida

git log --stat
# Muestra estadísticas de cambios

git log --graph --oneline --decorate --all
# Muestra gráficamente las ramas y commits

git shortlog
# Agrupa commits por autor
```

