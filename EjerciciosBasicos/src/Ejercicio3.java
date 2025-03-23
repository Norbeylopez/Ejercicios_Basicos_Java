import java.util.Scanner;
public class Ejercicio3 {
	
	private Scanner scanner;
	
	public Ejercicio3 (Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void verificarTemp () { 
		pedirTemp();
	}
	
	public void pedirTemp() { 
		System.out.print("Ingresa la temperatura");
		Integer temperatura = scanner.nextInt();
		
		procesarTemp(temperatura);
		
	}
	
	public void procesarTemp(Integer temperatura) {
		if (temperatura >= 18 && temperatura <= 25) {
			System.out.print("La temperatura es ideal");
		}else {
			System.out.print("La temperatura esta fuera del rango");
		}
	}

}
