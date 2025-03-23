import java.util.Scanner;

public class Ejercicio8 {

    private Scanner scanner;

    public Ejercicio8(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.print("🎬 Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad <= 0) {
            System.out.println("⚠️ Error: La edad debe ser un número positivo.");
            return;
        }

        System.out.println("\n📌 Películas recomendadas para usted:");

        if (edad < 7) {
            System.out.println("🎞️ 'Coco'");
            System.out.println("🎞️ 'Toy Story'");
            System.out.println("🎞️ 'Buscando a Nemo'");
        } else if (edad <= 17) {
            System.out.println("🎞️ 'Spider-Man: Un nuevo universo'");
            System.out.println("🎞️ 'Los Increíbles'");
            System.out.println("🎞️ 'Harry Potter y la piedra filosofal'");
        } else if (edad <= 30) {
            System.out.println("🎞️ 'Avengers: Endgame'");
            System.out.println("🎞️ 'El lobo de Wall Street'");
            System.out.println("🎞️ 'Inception'");
        } else {
            System.out.println("🎞️ 'El Padrino'");
            System.out.println("🎞️ 'Forrest Gump'");
            System.out.println("🎞️ 'Casablanca'");
        }
    }
}
