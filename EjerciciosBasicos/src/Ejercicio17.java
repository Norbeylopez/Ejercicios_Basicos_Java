import java.util.Scanner;

public class Ejercicio17 {
    
    private Scanner scanner;

    public Ejercicio17(Scanner scanner) {
        this.scanner = scanner;
    }

    public void calcularDescuento() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        double precioFinal = precio - (precio * descuento / 100);

        System.out.println("El precio final con el descuento aplicado es: $" + precioFinal);
    }
}
