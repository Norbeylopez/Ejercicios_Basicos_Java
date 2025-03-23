import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    
    private Scanner scanner;

    public Ejercicio16(Scanner scanner) {
        this.scanner = scanner;
    }

    public void jugarAdivinanza() {
        int numeroSecreto = generarNumeroAleatorio();
        int intento;

        System.out.println("🎲 ¡Bienvenido al juego de adivinanza!");
        System.out.println("He elegido un número entre 1 y 100. ¡Intenta adivinarlo!");

        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("🔼 El número es mayor. ¡Intenta de nuevo!");
            } else if (intento > numeroSecreto) {
                System.out.println("🔽 El número es menor. ¡Prueba otra vez!");
            } else {
                System.out.println("🎉 ¡Felicidades! Has adivinado el número.");
            }
        } while (intento != numeroSecreto);
    }

    private int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Número entre 1 y 100
    }
}