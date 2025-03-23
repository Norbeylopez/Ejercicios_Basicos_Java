import java.util.Scanner;

public class Ejercicio15 {

    private Scanner scanner;

    public Ejercicio15(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.println("⏳ Bienvenido a la cuenta regresiva ⏳");

        System.out.print("Ingrese un número entero positivo para iniciar la cuenta regresiva: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("⚠️ El número debe ser mayor que 0.");
            return;
        }

        System.out.println("\n🚀 Iniciando cuenta regresiva...");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("🎉 ¡Tiempo cumplido!");
    }
}
