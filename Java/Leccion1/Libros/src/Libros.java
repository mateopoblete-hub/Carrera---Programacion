import java.util.Scanner;

public class Libros {
    public static void main (String[]args){
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del libro: ");
        String nombreLibro = Scanner.nextLine();
        
        System.out.print("Escriba el nombre del autor del libro: ");
        String nombreAutor = Scanner.nextLine();
        
        System.out.println("El libro " + nombreLibro + " fue escrito por " + nombreAutor);
        
        Scanner.close();
    }
}
