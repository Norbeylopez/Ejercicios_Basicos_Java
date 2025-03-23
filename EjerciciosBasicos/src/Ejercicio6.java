import java.util.Scanner;

public class Ejercicio6 {

    private Scanner scanner;

    public Ejercicio6(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.print("Ingrese el tipo de producto (A - Alimentos, V - Vestimenta, E - Electrónicos): ");
        char tipoProducto = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("⚠️ Error: La cantidad debe ser un número positivo.");
            return;
        }

        double precioBase;
        double descuento = 0;

        switch (tipoProducto) {
            case 'A':
                precioBase = 10.0; // Precio base de alimentos
                descuento = 0.10;
                break;
            case 'V':
                precioBase = 20.0; // Precio base de vestimenta
                descuento = 0.05;
                break;
            case 'E':
                precioBase = 50.0; // Precio base de electrónicos
                descuento = 0.0;
                break;
            default:
                System.out.println("⚠️ Error: Tipo de producto inválido.");
                return;
        }

        double costoSinDescuento = precioBase * cantidad;
        double costoConDescuento = costoSinDescuento * (1 - descuento);

        System.out.println("🛒 Costo sin descuento: $" + costoSinDescuento);
        System.out.println("💰 Costo con descuento: $" + costoConDescuento);
    }
}
