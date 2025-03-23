import java.util.Scanner;

public class Ejercicio7 {

    private Scanner scanner;

    public Ejercicio7(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("⚠️ Error: El peso y la altura deben ser valores positivos.");
            return;
        }

        double imc = peso / (altura * altura);
        String categoria;

        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 24.9) {
            categoria = "Peso normal";
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        System.out.printf("📊 Su IMC es: %.2f%n", imc);
        System.out.println("🏥 Categoría: " + categoria);
    }
}
