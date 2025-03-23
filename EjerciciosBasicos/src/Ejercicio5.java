import java.util.Scanner;

public class Ejercicio5 {

    private Scanner scanner;

    public Ejercicio5(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.print("Ingrese la temperatura ambiente: ");
        int temperatura = scanner.nextInt();

        if (temperatura > 0 && temperatura < 38) {
            System.out.println("✅ Temperatura aceptable.");

            System.out.print("Ingrese el piso al que desea ir: ");
            int piso = scanner.nextInt();

            System.out.println("🚀 Moviendo el ascensor al piso " + piso + "...");
            System.out.println("✅ Llegaste al piso " + piso + ".");
        } else {
            System.out.println("⚠️ Temperatura fuera de rango. El ascensor no se moverá.");
        }
    }
}
