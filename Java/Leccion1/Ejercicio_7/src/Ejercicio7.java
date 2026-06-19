
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int salario = 1000;
        int comision = 150, venta;
        float salarioMensual, ventaCarro, porVenta, totalPrecio;

        System.out.print("Digite la cantidad de carros vendidos: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite el precio de un carro: ");
        ventaCarro = Float.parseFloat(entrada.nextLine());

        comision = venta;
        totalPrecio = ventaCarro + venta;
        porVenta = totalPrecio * 0.05F;
        salarioMensual = salario + comision + porVenta;

        System.out.println("Su salario mensual es: " + salarioMensual);
    }
}
