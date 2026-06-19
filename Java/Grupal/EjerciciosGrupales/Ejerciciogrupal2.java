package EjercicioGrupal1;

import java.util.Scanner;

public class Ejerciciogrupal2 {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el valor de a: ");
        double a = entrada.nextDouble();
        
        System.out.print("Digite el valor de b: ");
        double b = entrada.nextDouble();
        
        double resultado = Math.pow(a + b, 2);

        System.out.println("El cuadrado de la suma es: " + resultado);       
    }
}
    
