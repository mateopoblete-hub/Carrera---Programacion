import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Calculadora de Salario Semanal ");
        
        System.out.print("Ingrese las horas semanales trabajadas: ");
        double horasTrabajadas = entrada.nextDouble();
        
        System.out.print("Ingrese el salario por hora: ");
        double salarioPorHora = entrada.nextDouble();
        
        double salarioSemanal = horasTrabajadas * salarioPorHora;
      
        System.out.println("Resultado: ");
        System.out.printf("Horas trabajadas: %.2f%n", horasTrabajadas);
        System.out.printf("Salario por hora: $%.2f%n", salarioPorHora);
        System.out.printf("Salario semanal: $%.2f%n", salarioSemanal);                
    } 
}
