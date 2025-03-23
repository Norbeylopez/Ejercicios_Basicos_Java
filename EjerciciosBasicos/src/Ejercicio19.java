import java.util.Scanner;

public class Ejercicio19 {
    
    private Scanner scanner;

    public Ejercicio19(Scanner scanner) {
        this.scanner = scanner;
    }

    public void convertirTemperatura() {
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + "°F");
    }
}
