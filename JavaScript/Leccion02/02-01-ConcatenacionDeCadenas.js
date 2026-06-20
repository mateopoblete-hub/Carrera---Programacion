var nombre = "Juan ";
var apellido = "Perez";
var nombreCompleto = nombre+ " "+ apellido;
console.log(nombreCompleto);
var nombreCompleto2 = "Mateo"+" "+"Bassotti";
console.log(nombreCompleto2);
var juntos = nombre + 219;//Lee de izquierda a derecha siguiendo la cadena, lee el numero como str
console.log(juntos);
juntos = nombre + (70 + 20);//Aca se puede diferenciar a traves de los parantesis
console.log(juntos);
juntos = 70 + 20 + nombre;
console.log(juntos);


nombre += apellido;//Tercera concatenacion usando el operador simplic+ficado
console.log(nombre);

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido = "Peres"; una constante no puede ser modificada
console.log(apellido2);

let x, y;//Se puede crear varias variables dentro de una misma linea
x = 20, y = 60;//Se puede hacer asignacion de varias variables dentro de la misma linea
let z = x + y;//Se aigna el valor de la operacion
console.log(z);

let _1num = 40;//No utiliza numero para inicializar
let rompeTodo = "rompe";//No utilizar palbras resevadas para variables

console.log(_1num);
console.log(rompeTodo);