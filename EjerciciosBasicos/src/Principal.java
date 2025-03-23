import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Ejercicio1 ascensor = new Ejercicio1(scanner);
		ascensor.iniciarProceso();
		
		Ejercicio2 ascensor2 = new Ejercicio2(scanner);
		ascensor2.iniciarVeri();
		
		Ejercicio3 sensortem = new Ejercicio3(scanner);
		sensortem.verificarTemp();
		
		Ejercicio4 sensortem2 = new Ejercicio4(scanner);
		sensortem2.verificarTemp2();
		
        Ejercicio5 ascensor3 = new Ejercicio5(scanner);
        ascensor3.ejecutar();
        
        Ejercicio6 tienda = new Ejercicio6(scanner);
        tienda.ejecutar();  
		
        Ejercicio7 imcCalculator = new Ejercicio7(scanner);
        imcCalculator.ejecutar();  
		
        Ejercicio8 cine = new Ejercicio8(scanner);
        cine.ejecutar();  
		
        Ejercicio9 campeonato = new Ejercicio9(scanner);
        campeonato.ejecutar();  
        
        Ejercicio10 restaurante = new Ejercicio10(scanner);
        restaurante.ejecutar(); 
		
        Ejercicio11 cajero = new Ejercicio11(scanner);
        cajero.ejecutar(); 
		
        Ejercicio12 tiendaOnline = new Ejercicio12(scanner);
        tiendaOnline.ejecutar(); 
		
        Ejercicio13 impresora = new Ejercicio13(scanner);
        impresora.ejecutar();
        
        Ejercicio14 viaje = new Ejercicio14(scanner);
        viaje.ejecutar(); 
        
        Ejercicio15 cuentaRegresiva = new Ejercicio15(scanner);
        cuentaRegresiva.ejecutar(); 
		
        Ejercicio16 adivinanza = new Ejercicio16(scanner);
        adivinanza.jugarAdivinanza();

        Ejercicio17 descuento = new Ejercicio17(scanner);
        descuento.calcularDescuento();

        Ejercicio18 vocales = new Ejercicio18(scanner);
        vocales.contarVocales();

        Ejercicio19 temperatura = new Ejercicio19(scanner);
        temperatura.convertirTemperatura();

        Ejercicio20 pares = new Ejercicio20(scanner);
        pares.contarNumerosPares();
        
        
        
        

        
        


	}
	

}