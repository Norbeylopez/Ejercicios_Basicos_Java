import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Ejercicio1 ascensor = new Ejercicio1(scanner);
		ascensor.iniciarProceso();
		
		Ejercicio2 ascensor2 = new Ejercicio2(scanner);
		ascensor2.iniciarVeri();

	}
	

}