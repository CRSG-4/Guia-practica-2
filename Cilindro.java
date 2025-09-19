import java.util.Scanner;

public class Cilindro {
	public static void main (String[]liz){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el radio del cilindro: ");
		double radio = entrada.nextDouble();
		
		System.out.print("Ingrese la altura del cilindro: ");
		double altura = entrada.nextDouble();
		
		double area = 2 * Math.PI * radio * (radio + altura);
		
		System.out.println("El area del cilindro es: " + area);

		entrada.close();
	}
}