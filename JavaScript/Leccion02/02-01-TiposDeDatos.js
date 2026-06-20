//Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios es muy similar a la de Java realmente diriamos que es identica
*/
var nombre = "Mateo";//Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
var numero = 2000; //Tipo numerico
console.log(numero);

var objeto = {
    nombre : "Mateo",
    apellido : "Poblete",
    telefono : "2604558423"
}

console.log(typeof objeto);

//Tipo de boolean
var bandera = true;
console.log(bandera);

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de datos symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato underfined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

// null: signifaca ausencia de valor
var y = null;//null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ["Citreon", "Prisma", "Audi", "Ford"];
console.log(autos);
console.log(typeof autos);

var z = "";
console.log(z); //Esto se refiere a que es una cadena vacia
console.log(typeof z);
