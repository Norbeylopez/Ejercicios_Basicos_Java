import java.util.Scanner;
public class Ejercicio4 {
	
	private Scanner scanner;
	
	public Ejercicio4 (Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void verificarTemp2 () {
		pedirTemp2();
	}
	
	public void pedirTemp2() {
		System.out.print("Ingrese la temperatura");
		Integer temperatura2 = scanner.nextInt();
		
		procesarTemp2(temperatura2);
	}
	
	public void procesarTemp2(Integer temperatura2) {
		if (temperatura2 > 0 && temperatura2 < 38) {
			System.out.print("La temperatura es ideal");
		}else {
			System.out.print("Alerta la temperatura esta elevada");
		}
	}

}
