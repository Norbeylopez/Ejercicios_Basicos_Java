import java.util.Scanner;

public class Ejercicio10 {

    private Scanner scanner;
    private double total;

    public Ejercicio10(Scanner scanner) {
        this.scanner = scanner;
        this.total = 0;
    }

    public void ejecutar() {
        System.out.println("🍽️ Bienvenido al menú del restaurante 🍽️");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n📜 Menú:");
            System.out.println("1️⃣ Hamburguesa - $10.00");
            System.out.println("2️⃣ Pizza - $12.00");
            System.out.println("3️⃣ Ensalada - $8.00");
            System.out.println("4️⃣ Refresco - $3.00");
            System.out.println("5️⃣ Jugo Natural - $4.00");
            System.out.println("6️⃣ Terminar pedido");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    total += 10;
                    System.out.println("🍔 Agregaste una Hamburguesa.");
                    break;
                case 2:
                    total += 12;
                    System.out.println("🍕 Agregaste una Pizza.");
                    break;
                case 3:
                    total += 8;
                    System.out.println("🥗 Agregaste una Ensalada.");
                    break;
                case 4:
                    total += 3;
                    System.out.println("🥤 Agregaste un Refresco.");
                    break;
                case 5:
                    total += 4;
                    System.out.println("🍹 Agregaste un Jugo Natural.");
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        }

        if (total == 0) {
            System.out.println("⚠️ No seleccionaste ningún producto.");
            return;
        }

        System.out.println("\n💰 Total antes de descuento: $" + total);

        System.out.println("\n📌 Métodos de pago:");
        System.out.println("1️⃣ Efectivo (10% de descuento)");
        System.out.println("2️⃣ Tarjeta de crédito (5% de descuento)");
        System.out.println("3️⃣ Cheque (sin descuento)");

        System.out.print("Seleccione su método de pago: ");
        int metodoPago = scanner.nextInt();

        switch (metodoPago) {
            case 1:
                total *= 0.90;
                System.out.println("💵 Pago en efectivo: 10% de descuento aplicado.");
                break;
            case 2:
                total *= 0.95;
                System.out.println("💳 Pago con tarjeta: 5% de descuento aplicado.");
                break;
            case 3:
                System.out.println("📜 Pago con cheque: No hay descuento.");
                break;
            default:
                System.out.println("⚠️ Método de pago no válido. No se aplicó descuento.");
        }

        System.out.println("\n✅ Total final a pagar: $" + String.format("%.2f", total));
        System.out.println("🍽️ ¡Gracias por su compra!");
    }
}
