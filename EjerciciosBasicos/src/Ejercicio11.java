import java.util.Scanner;

public class Ejercicio11 {

    private Scanner scanner;
    private double saldo;

    public Ejercicio11(Scanner scanner) {
        this.scanner = scanner;
        this.saldo = 500.00; // Saldo inicial
    }

    public void ejecutar() {
        System.out.println("🏦 Bienvenido al cajero automático 🏦");
        System.out.println("💰 Saldo actual: $" + String.format("%.2f", saldo));

        System.out.print("\nIngrese el monto que desea retirar: ");
        double monto = scanner.nextDouble();

        if (monto <= 0) {
            System.out.println("⚠️ Monto inválido. Ingrese un valor positivo.");
        } else if (monto > saldo) {
            System.out.println("❌ Fondos insuficientes. No puedes retirar más de $" + String.format("%.2f", saldo));
        } else {
            saldo -= monto;
            System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + String.format("%.2f", saldo));
        }

        System.out.println("🏦 Gracias por usar el cajero automático. 🏦");
    }
}
