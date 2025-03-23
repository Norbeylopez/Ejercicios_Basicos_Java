import java.util.Scanner;

public class Ejercicio20 {
    
    private Scanner scanner;

    public Ejercicio20(Scanner scanner) {
        this.scanner = scanner;
    }

    public void contarNumerosPares() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " números pares entre 1 y " + numero);
    }
}
