import java.util.Scanner;

public class Ejercicio14 {

    private Scanner scanner;

    public Ejercicio14(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.println("🚗 Bienvenido al simulador de viaje en coche 🚗");

        boolean continuar = true;

        while (continuar) {
            System.out.print("\nIngrese la distancia total del viaje (en km): ");
            double distancia = scanner.nextDouble();

            if (distancia <= 0) {
                System.out.println("⚠️ La distancia debe ser mayor a 0.");
                continue;
            }

            System.out.print("Ingrese la velocidad promedio del coche (km/h): ");
            double velocidad = scanner.nextDouble();

            if (velocidad <= 0) {
                System.out.println("⚠️ La velocidad debe ser mayor a 0.");
                continue;
            }

            double tiempo = distancia / velocidad;
            System.out.printf("⏳ Tiempo estimado de viaje: %.2f horas.\n", tiempo);

            System.out.print("\n¿Desea calcular otro viaje? (s/n): ");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("🏁 Fin de la simulación de viajes.");
    }
}
