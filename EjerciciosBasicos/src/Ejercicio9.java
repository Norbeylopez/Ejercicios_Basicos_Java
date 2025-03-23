import java.util.Scanner;

public class Ejercicio9 {

    private Scanner scanner;
    private int puntosEquipo;

    public Ejercicio9(Scanner scanner) {
        this.scanner = scanner;
        this.puntosEquipo = 0;
    }

    public void ejecutar() {
        System.out.println("🏆 Bienvenido al sistema de clasificación del campeonato deportivo 🏆");

        boolean continuar = true;

        while (continuar) {
            System.out.print("\nIngrese el resultado del partido (ganado, perdido, empatado) o 'salir' para terminar: ");
            String resultado = scanner.next().toLowerCase();

            switch (resultado) {
                case "ganado":
                    puntosEquipo += 3;
                    System.out.println("✅ ¡Victoria! Se suman 3 puntos.");
                    break;
                case "empatado":
                    puntosEquipo += 1;
                    System.out.println("⚖️ Empate. Se suma 1 punto.");
                    break;
                case "perdido":
                    System.out.println("❌ Derrota. No se suman puntos.");
                    break;
                case "salir":
                    continuar = false;
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Ingrese 'ganado', 'perdido', 'empatado' o 'salir'.");
            }

            System.out.println("🔢 Puntos actuales: " + puntosEquipo);
        }

        System.out.println("\n🏁 Clasificación final: " + puntosEquipo + " puntos.");
    }
}
