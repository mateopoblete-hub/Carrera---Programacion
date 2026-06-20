//Ejercicio para encontrar numeros pares
let parInpar = 9;
if(parInpar % 2 == 0) {
    console.log("Es Par");
}
else{
    console.log("Es Impar");
}

//Ejercicio: es mayor de edad
let edad = 20, adulto = 18;
if (edad >= adulto){
    console.log("Es una persona adulta");
}
else{
    console.log("Sos una menor de edad")
}

//Ejercicio: Dentro de un rango
let dentroRango = 10; //Aqui vamor a ir cambiando el valor
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango establecido");
}
else{
    console.log("Esta fuera del rango establecido");
}

//Ejercicio si el padre puede asisitir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asisitir al juego de su hijo")
}
else{
    console.log("El padre no puede asistir al partido de su hijo")
}

//Operadores Ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 12;
resultado2 = numero % 2 == 0 ? "Es un numero Par" : "Es un numero Impar";
console.log(resultado2)

let miNumero = "21";//Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero);//Esta es una funcion
console.log(typeof edad2);
if(isNaN(edad2)){//No es un numero = is Not a Number(devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar");
    }
}

//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "No puede votar";
console.log(resultado3);

//Funcion isNaN


