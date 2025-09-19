import java.util.Scanner;

public class SolicitarNumeros {
    public static void main(String args[]){

        int num1, num2, num3, num4, num5, num6, comparacion1, comparacion2, comparacion3, comparacion4, resultadoMax, resultadoMin;
        Scanner pedirNum = new Scanner(System.in);
        System.out.println("Se van a solicitar 6 numeros");
        System.out.println("Primer numero: ");
        num1 = pedirNum.nextInt();
        System.out.println("Segundo numero: ");
        num2 = pedirNum.nextInt();
        System.out.println("Tercer numero: ");
        num3 = pedirNum.nextInt();
        System.out.println("Cuaro numero: ");
        num4 = pedirNum.nextInt();
        System.out.println("Quinto numero: ");
        num5 = pedirNum.nextInt();
        System.out.println("Sexto numero: ");
        num6 = pedirNum.nextInt();
        pedirNum.close();

        comparacion1 = Math.max(num1, num2);
        comparacion2 = Math.max(num3, num4);
        comparacion3 = Math.max(num5, num6);
        comparacion4 = Math.max(comparacion1, comparacion2);
        resultadoMax = Math.max(comparacion3, comparacion4);

        comparacion1 = Math.min(num1, num2);
        comparacion2 = Math.min(num3, num4);
        comparacion3 = Math.min(num5, num6);
        comparacion4 = Math.min(comparacion1, comparacion2);
        resultadoMin = Math.min(comparacion3, comparacion4);

        System.out.println("El mayor número es: " + resultadoMax);
        System.out.println("El menor número es:"  + resultadoMin);

    }
    
}
