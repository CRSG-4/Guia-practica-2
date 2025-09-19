import java.util.Scanner;
public class totalPagar {
    public static void main(String[] args) {
        double valorTotal = 0;
        double producto;
        double valorDescuento;
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantos productos usted compró?");
        int numeroProductos = input.nextInt();

        for (int i = 1; i <= numeroProductos; i++){

            System.out.println("¿Cual es el valor del producto " + i + " ?");
            producto = input.nextDouble();
            valorTotal = producto + valorTotal;

        }

        if ( valorTotal >= 20){

            System.out.println("¡Tu comprá es aplicable para un descuento!");

            if ( valorTotal < 36){
                valorDescuento = valorTotal - (valorTotal * 0.05);
                System.out.println("Por tu compra de " + valorTotal + "$, tienes un descuento del 5%. Así que tu compra queda en: " + valorDescuento + "$");
            }

            else if ( valorTotal >= 36 & valorTotal <= 50){
                valorDescuento = valorTotal - (valorTotal * 0.08);
                System.out.println("Por tu compra de " + valorTotal + "$, tienes un descuento del 8%. Así que tu compra queda en: " + valorDescuento + "$");

            } else {
                valorDescuento = valorTotal - (valorTotal * 0.1);
                System.out.println("Por tu compra de " + valorTotal + "$, tienes un descuento del 10%. Así que el total a pagar es: " + valorDescuento + "$");

           }

        } else{

            System.out.println("Tu comprá no es aplicable para un descuento");
            System.out.println("tu total a pagar es: " + valorTotal);
        }
        

        input.close();
    }
}
