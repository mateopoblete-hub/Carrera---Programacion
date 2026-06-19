
package Leccion2;

import java.util.Scanner;

public class leccion2 {
    public static void main(String[] args) {
       /* var condicion = false;
        if(condicion){
            System.out.println("Condición Verdadera"); //condicional simple
        }
        else{
            System.out.println("Condición Falsa"); //Condicional doble
        }
        
        var numero = 6;
        var numeroTexto = ("Numero desconocido");
        if (numero == 1){
            numeroTexto = "Numero uno";
        }
        else if (numero == 2){
            numeroTexto = "Numero dos";
        }
        else if (numero == 3){
            numeroTexto = "Numero tres";
        }
        else if (numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            numeroTexto = "Numero no encontrado";    
        }
        System.out.println("numeroTexto = " + numeroTexto);*/
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero del 1 al 4: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Valor desconocido";
        switch(numero) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        }
    }

