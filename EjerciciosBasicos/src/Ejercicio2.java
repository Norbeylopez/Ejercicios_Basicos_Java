import java.util.Scanner;
public class Ejercicio2 {
	
	private Scanner scanner;
	
	public Ejercicio2 (Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void iniciarVeri() {
		pedirPeso();
	}
	
	public void pedirPeso() {
		System.out.print("Ingresa el peso");
		Integer peso = scanner.nextInt();
		
		procesarDatos(peso);
		
	}
	
	public void procesarDatos(Integer peso) {
		if (peso > 0 && peso < 80) {
			System.out.print("Tu peso es ideal");			
		}else {
			System.out.print("Tu peso sobre pasa el limite");
		}
	}

	
}
