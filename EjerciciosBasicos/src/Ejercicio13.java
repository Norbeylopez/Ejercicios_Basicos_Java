import java.util.Scanner;

public class Ejercicio13 {

    private Scanner scanner;
    private int papelDisponible;

    public Ejercicio13(Scanner scanner) {
        this.scanner = scanner;
        this.papelDisponible = 50; // Capacidad inicial de papel
    }

    public void ejecutar() {
        System.out.println("🖨️ Bienvenido a la impresora 🖨️");
        System.out.println("📄 Papel disponible: " + papelDisponible + " hojas.");

        boolean continuar = true;

        while (continuar && papelDisponible > 0) {
            System.out.print("\nIngrese la cantidad de páginas a imprimir: ");
            int paginas = scanner.nextInt();

            if (paginas <= 0) {
                System.out.println("⚠️ La cantidad de páginas debe ser mayor a 0.");
            } else if (paginas > papelDisponible) {
                System.out.println("❌ No hay suficiente papel. Solo quedan " + papelDisponible + " hojas.");
            } else {
                papelDisponible -= paginas;
                System.out.println("✅ Se imprimieron " + paginas + " páginas.");
                System.out.println("📄 Papel restante: " + papelDisponible + " hojas.");
            }

            if (papelDisponible > 0) {
                System.out.print("\n¿Desea imprimir más páginas? (s/n): ");
                String respuesta = scanner.next();
                continuar = respuesta.equalsIgnoreCase("s");
            } else {
                System.out.println("🚨 Se acabó el papel. No se pueden imprimir más páginas.");
            }
        }

        System.out.println("🖨️ Fin del proceso de impresión.");
    }
}
