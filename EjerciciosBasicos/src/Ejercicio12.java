import java.util.Scanner;

public class Ejercicio12 {

    private Scanner scanner;
    private double totalCompra;

    public Ejercicio12(Scanner scanner) {
        this.scanner = scanner;
        this.totalCompra = 0.0;
    }

    public void ejecutar() {
        System.out.println("🛒 Bienvenido a la tienda en línea 🛒");

        boolean seguirComprando = true;

        while (seguirComprando) {
            System.out.print("\nIngrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad que desea comprar: ");
            int cantidad = scanner.nextInt();

            if (precio <= 0 || cantidad <= 0) {
                System.out.println("⚠️ Precio o cantidad inválida. Ingrese valores positivos.");
            } else {
                double costoProducto = precio * cantidad;
                totalCompra += costoProducto;
                System.out.println("✅ Producto agregado. Costo del producto: $" + String.format("%.2f", costoProducto));
            }

            System.out.print("\n¿Desea agregar otro producto? (s/n): ");
            String respuesta = scanner.next();

            seguirComprando = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("\n🛍️ Costo total de la compra: $" + String.format("%.2f", totalCompra));
        System.out.println("📦 Gracias por comprar con nosotros. 📦");
    }
}
