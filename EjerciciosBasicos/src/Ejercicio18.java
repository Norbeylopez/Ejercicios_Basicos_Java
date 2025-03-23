import java.util.Scanner;

public class Ejercicio18 {
    
    private Scanner scanner;

    public Ejercicio18(Scanner scanner) {
        this.scanner = scanner;
    }

    public void contarVocales() {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next().toLowerCase();

        int contador = 0;
        for (char letra : palabra.toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) {
                contador++;
            }
        }

        System.out.println("La palabra tiene " + contador + " vocales.");
    }
}
