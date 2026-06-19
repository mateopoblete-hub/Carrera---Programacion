package EjercicioGrupal1;

import java.util.Scanner;

public class EjercicioGrupal1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el total de horas: ");
        int totalHoras = entrada.nextInt();
        
        int semanas = totalHoras / 168;
        int horasRestantes = totalHoras % 168;
        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;
        
        System.out.println("Equivalente a: ");
        System.out.println(semanas + "semanas");
        System.out.println(dias + "dias");
        System.out.println(horas + "horas");
    }
}

