package EjercicioGrupal1;

import java.util.Scanner;

public class EjercicioGrupal3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double participacion, primerExamen, segundoExamen, examenFinal, calificacionFinal;
        
        System.out.println("Ingrese las calificaciones del estudiante: ");
        
        System.out.print("Participación (10%): ");
        participacion = entrada.nextDouble();
        
        System.out.print("Primer examen parcial (25%): ");
        primerExamen = entrada.nextDouble();
        
        System.out.print("Segundo examen parcial (25%): ");
        segundoExamen = entrada.nextDouble();
        
        System.out.print("Examen final (40%): ");
        examenFinal = entrada.nextDouble();
        
        calificacionFinal = (participacion * 0.10) + (primerExamen * 0.25) + (segundoExamen * 0.25) + (examenFinal * 0.40);
        
        System.out.println("La calificación final es: " + calificacionFinal);
    }
}

