// Nuestro primer programa HolaMundo, Comentario de una sola linea
/*
muchas Lineas, Comentario Extensivo: De muchas lineas
mas
*/
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
           /* System.out.println("Hola Mundo desde java");
    
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
      
       //Var - inferencias en tipo de java
       var miVariableEntera2 = 10;
       var miVariableCadena2 = "Seguimos estudiando";
       System.out.println("miVariableEntera2 = "  + miVariableEntera2);
       System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
    //souttv + tab
    //Reglas para definir una variable en java
    var usuario = "Mateo";
    var titulo = "Tecnico minero";
    var union = titulo +" "+ usuario;
    System.out.println("Union = " + union);
       
    var a = 8;
    var b = 4;
    System.out.println(usuario + (a + b));
    
    //Ejercicio: caracteres especiales en java
    var nombre = "Mateo";
    System.out.println("Nueva linea: \n" + nombre);
    System.out.println("Tabulador: \t" + nombre);
    System.out.println("\t.:MENU:.");
    System.out.println("Retroseso: \b\b" + nombre);
    System.out.println("Comillas simples: \'" + nombre + "'");
    System.out.println("Comillas dobles: \"" + nombre + "\"");
    
       
    //Clase scanner
    Scanner entrada = new Scanner (System.in);
    System.out.println("Ingrese su nombre: ");
    var usuario2 = entrada.nextLine();
    System.out.println("usuario2 = " + usuario2);
    System.out.println("Escribe el titulo: ");
    var titulo2 = entrada.nextLine();
    System.out.println("Resultado: " + titulo2 + " " + usuario2 );
        
    byte numEntero = 10;

    System.out.println("Valor minimo Byte: " + Byte.MIN_VALUE);
    System.out.println("Valor maximo Byte: " + Byte.MAX_VALUE);
       
    byte numEnteroByte = 127;

    System.out.println("numEnteroByte = " + numEnteroByte);
    System.out.println("Valor mínimo del Byte:" + Byte.MIN_VALUE);
    System.out.println("Valor máximo del Byte:" + Byte.MAX_VALUE);

    short numEnteroShort = 32767;

    System.out.println("numEnteroShort = " + numEnteroShort);
    System.out.println("Valor mínimo del Short:" + Short.MIN_VALUE);
    System.out.println("Valor máximo del Short:" + Short.MAX_VALUE);

    int numEnteroInt = 2147483647;

    System.out.println("numEnteroInt = " + numEnteroInt);
    System.out.println("Valor mínimo del int:" + Integer.MIN_VALUE);
    System.out.println("Valor máximo del int:" + Integer.MAX_VALUE);

    long numEnteroLong = 10;

    System.out.println("numEnteroLong = " + numEnteroLong);
    System.out.println("Valor mínimo del long:" + Long.MIN_VALUE);
    System.out.println("Valor máximo del long:" + Long.MAX_VALUE);
      
    float numFloat = (float)3.4028236E38D;

    System.out.println("numFloat = " + numFloat);
    System.out.println("El valor mínimo de float:" + Float.MIN_VALUE);
    System.out.println("El valor máximo de float:" + Float.MAX_VALUE);

    double numDouble = 1.7976931348623157E308D;

    System.out.println("numDouble = " + numDouble);
    System.out.println("El valor mínimo de double:" + Double.MIN_VALUE);
    System.out.println("El valor máximo de double:" + Double.MAX_VALUE);
    
    //Inferencia de tipo var y tipo primitivo
    var numEntero = 20;//Las literales sin punto automaticamente son tipo int
    System.out.println("numEntero = " + numEntero);
    var numFloat = 10.0F;// Automaticamente con el punto se transforma en double
    System.out.println("numFloat = " + numFloat);
    var numDouble = 10.0;
    System.out.println("numDouble = " + numDouble);
           
    //tipos primitivos char
    
    char miVariableChar = 'a';
    System.out.println("miVariableChar = " + miVariableChar);

    char varCaracter = '\u0024'; // Indicamos a Java la asignación con el código unicode
    System.out.println("varCaracter = " + varCaracter);

    char varCaracterDecimal = 36; // Valor decimal del juego de caracteres unicode
    System.out.println("varCaracterDecimal = " + varCaracterDecimal);

    char varCaracterSimbolo = '$'; // Un carácter especial, podemos copiar y pegar desde unicode
    System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

    char varCaracter1 = '\u0024'; // Indicamos a Java la asignación con el código unicode
    System.out.println("varCaracter1 = " + varCaracter1);

    char varCaracterDecimal1 = (char)36; // Valor decimal del juego de caracteres unicode
    System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);

    char varCaracterSimbolol = '$'; // Un carácter especial, podemos copiar y pegar desde unicode
    System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolol);
            
    int varEnteroChar = '$';
    System.out.println("varEnteroChar = " + varEnteroChar);
    int caracterChar = 'b';
    System.out.println("caracterChar = " + caracterChar);
           
    //Tipos primitivos tipos booleanos
    var varBool = false;
    System.out.println("varBool = " + varBool);
    
    if (varBool) {
        System.out.println("La bandera es verde");  
    }
    else{
        System.out.println("La bandera es roja");
    }
    var edad = 18;
    //var adulto = edad >= 10;
    if (edad >= 18) {
        System.out.println("Eres mayor de edad");
        
    }
    else{
        System.out.println("Eres menos de edad");
           
    //Conversion de tipos primitivos
    var edad = Integer.parseInt("20");
    System.out.println("edad = " + (edad + 1));
    var valorPI = Double.parseDouble("3.1416");
    System.out.println("valosPI = " + valorPI);
    
    //Pedir un valor
    var entrada = new Scanner(System.in);
   //System.out.println("Digite su edad: ");
    //edad = Integer.parseInt (entrada.nextLine());
    //System.out.println("edad = " + edad);
           
    //Conversion de tipos primitivos en Java Parte 2
    var edad7exto = String.valueOf(10);
    System.out.println("edadTexto = " + edad7exto);
    
    var fraseChar = "Programadores".charAt(4);
    System.out.println("fraseChar = " + fraseChar);
    
    System.out.println("Digite un caracter: ");
    fraseChar = entrada.nextLine().charAt(0);
    System.out.println("fraseChar = " + fraseChar);
           
    int num1 = 5, num2 = 4;
    var solucion = num1 + num2;
    System.out.println("Solucion de la suema = " + solucion);
    
    solucion = num1 - num2;
    System.out.println("solucion de la resta = " + solucion);
    
    solucion = num1 * num2;
    System.out.println("Solucion de la multiplicacion = " + solucion);
    
    solucion = num1 / num2;
    System.out.println("Solucion de la division = " + solucion);
    
    var solucion2 = 3.4D / num2;
    System.out.println("Solucion2 resultado de la division = " + solucion2);
    
    solucion = num1 % num2;//Guarda el residuo de la division
    System.out.println("Solucion = " + solucion);// 5/4
    
    if (num1 % 2 == 0)
        System.out.println("Esun numero par");
    else
        System.out.println("Es un numero impar");
           
    int varNum1 = 1, varNum2 = 4;
    var varNum3 = varNum1 + 6 - varNum2; // Una operación

    System.out.println("varNum3 = " + varNum3);

    varNum1 += 1;
    System.out.println("varNum1 = " + varNum1);

    varNum2 -= 2;
    System.out.println("varNum2 = " + varNum2);

    varNum1 *= 5;
    System.out.println("varNum1 = " + varNum1);

    varNum3 /= 4;
    System.out.println("varNum3 = " + varNum3);

    varNum1 %= 6;
    System.out.println("varNum1 = " + varNum1);
           
    // Operadores Unarios: Cambio de Signo
    var varA = 7;
    var varB = -varA;
    System.out.println("varA = " + varA);
    System.out.println("varB = " + varB); // El resultado será un número negativo

    // Operador de Negación
    var varC = true; // Esta literal por default en Java es de tipo boolean
    var varD = !varC; // Aquí está invirtiendo el valor

    System.out.println("varD = " + varD);
    
    //Operadores unarios de incremento: Preincremento
    var varE = 9;
    var varF = ++varE;
    
    // Primero se incrementa la variable y después se usa su valor
    System.out.println("varE = " + varE); // Se incrementa en la unidad
    System.out.println("varF = " + varF); // Va a sumar uno

    // Postincremento (el símbolo va después de la variable)
    var varG = 3;

    var varH = varG++; // Primero el valor de la variable, luego el incremento
    System.out.println("varG = " + varG);
    System.out.println("varH = " + varH);

    // Operadores Unarios de decremento: Predecremento
    var varI = 4;

    var varJ = --varI;
    System.out.println("varI = " + varI); // La variable ya está con decremento
    System.out.println("varJ = " + varJ);
    
    //Postdecremento
    var varK = 8;
    var varL = varK--;//Primero el valor de la variable, luego queda el decremento
    System.out.println("varK = " + varK);//Aqui va a decrementar en L
    System.out.println("varL = " + varL);
           
    //Operadores de igualdad y operacionales
    var aNum = 5;
    var bNum = 4;

    var cNum = (aNum == bNum);
    System.out.println("cNum = " + cNum);

    var dNum = aNum != bNum;
    System.out.println("dNum = " + dNum);

    var cadenaA = "Hello";
    var cadenaB = "bye bye";

    var cVar = cadenaA == cadenaB;
    System.out.println("cVar = " + cVar);
    
    var fVar = cadenaA.equals(cadenaB);
    System.out.println("fVar = " + fVar);
    
    var gVar = aNum >= bNum;// > >= < <= == !=
    System.out.println("gVar = " + gVar);
    
    if(bNum % 2 == 0){
        System.out.println("El numero es par");
    } else {
        System.out.println("El numero es impar");
        
    }
    
    var edad = 30;
    var adulto = 18;
    if (edad >= adulto){
        System.out.println("Es mayor de edad");
    }
    else {
        System.out.println("Es menor de edad");
    }
    
    // Operador Condicional And
    var valorA = 7;

    var valorMinimo = 0; // rango del 0 al 10
    var valorMaximo = 10;

    var respuesta = valorA >= 0 && valorA <= 10;

    if (respuesta) {
        System.out.println("Esta dentro del rango establecido");
  } else {
        System.out.println("Esta fuera del rango establecido");
  }
    
    var vacaciones = false;
    var diaLibre = true;
    if (vacaciones || diaLibre)
        System.out.println("Papa puede asistir al juego de su hijo");
    else
        System.out.println("Papa no puede asistir al juego de su hijo");
         
    //Operador Ternario
    var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
    System.out.println("resultadoT = " + resultadoT);

    var numeroT = 4;

    resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
    System.out.println("resultadoT = " + resultadoT);    */   
           
    var x = 5;
    var y = 10;

    var z = ++x + y--;

    System.out.println("x = " + x); // 6
    System.out.println("y = " + y); // 9
    System.out.println("z = " + z); // 16

    var solucionAritmetica = 4 + 5 * 6 / 3;//4 + ((5 * 6) / 3) = 30 / 3 = 10 + 4 = 14
    System.out.println("solicionAritmetica = " + solucionAritmetica);
    
    solucionAritmetica = (4 + 5) * 6 / 3;// 4 + 5 = 9 * 6 = 54 / 3 = 18
    System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
}


