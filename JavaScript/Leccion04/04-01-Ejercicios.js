//Ejercicio1: Calcular estacion del año
let mes = 4;
let estacion; // Undefined

if (mes == 1 || mes == 2 || mes == 12) {
    estacion = "Verano";
}
else if (mes == 3 || mes == 4 || mes == 5) {
    estacion = "Otoño";
}
else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = "Invierno";
}
else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = "Primavera";
}
else {
    estacion = "Valor incorrecto";
}

console.log("El valor corresponde a la estación de: " + estacion);

// Estructura switch (la sintaxis es igual a Java)
// No solo se pueden utilizar números, también cadenas
switch (mes) {
    case 1:case 2:case 12:
        estacion = "Verano";
        break;

    case 3:case 4:case 5:
        estacion = "Otoño";
        break;

    case 6:case 7:case 8:
        estacion = "Invierno";
        break;

    case 9:case 10:case 11:
        estacion = "Primavera";
        break;

    default:
        estacion = "Valor incorrecto";
}

console.log("Bienvenido a la estación de: " + estacion);

//Ejercicio2: Hora del dia
let horaDia = 9;
let mensaje;

if (horaDia >= 6 && horaDia <= 11) {
    mensaje = "Good morning";
}
else if (horaDia >= 12 && horaDia <= 16) {
    mensaje = "Good afternoon";
}
else if (horaDia >= 17 && horaDia <= 19) {
    mensaje = "Good evening";
}
else if (horaDia >= 20 && horaDia <= 23) {
    mensaje = "Good night";
}

//Aplicamos el uso de var let t const
/*
Con var pueden resignar en cualquier momento este forma parte del ambito global
Un error es que es sobrescriba
*/
var nombre ="Mateo";
nombre = "Ignacio";
console.log(nombre);

function saludar(){
    var nombre3 = "Natalia";
    console.log(nombre3);
}
console.log(nombre3);//Aqui no lee el dato en la funcion

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la funcion funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento la diferencia es que su ambito es de bloque, solo disponible dentro de un bloque de llaves o dentro de una funcion

*/

function soludar2(){
    let nombre2 = "Mateo";
    console.log(nombre2);
}
console.log(nombre2);

if(true){
    let edad= 33;
    console.log(edad2);
}
console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento);//Solo se ejecuta el console anterior

//let mes = 4;
//let estacion;

let days = 1;
switch (days){
    case 1:
        console.log("Hoy es Lunes");
        break;
    case 2:
        console.log("Hoy es Martes");
        break;
     case 3:
        console.log("Hoy es Miercoles");
        break;
    case 4:
        console.log("Hoy es Jueves");
        break;
    case 5:
        console.log("Hoy es Viernes");
        break;
     case 6:
        console.log("hoy es Sabado");
        break;
    case 7:
        console.log("hoy es Domingo");    
        break;
    default:
        console.log("Error en el ingreso del dia de la semana")
        break;
          
}
// Esta es la opcion mejorada
let days = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes"];
function getDay(n){
    if (n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days[n-1];
}
console.log(getDay(3));

//Meses del año Ejercicio
let mes = 1;  // Cambia este número según el mes (1-12)

switch (mes) {
    case 1:
        console.log("Enero");
        break;
    case 2:
        console.log("Febrero");
        break;
    case 3:
        console.log("Marzo");
        break;
    case 4:
        console.log("Abril");
        break;
    case 5:
        console.log("Mayo");
        break;
    case 6:
        console.log("Junio");
        break;
    case 7:
        console.log("Julio");
        break;
    case 8:
        console.log("Agosto");
        break;
    case 9:
        console.log("Septiembre");
        break;
    case 10:
        console.log("Octubre");
        break;
    case 11:
        console.log("Noviembre");
        break;
    case 12:
        console.log("Diciembre");
        break;
    default:
        console.log("Error en el ingreso del mes");
        break;
}

//Opcion mejorada
let months = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"];

function getMonth(n) {
    if (n < 1 || n > 12) {
        console.log("Error: Mes fuera de rango (1-12)");
        return;
    }
    console.log("El mes es " + months[n - 1]);
}
getMonth(3);   
getMonth(10);  