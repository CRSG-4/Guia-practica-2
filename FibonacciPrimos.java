public class FibonacciPrimos {

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 0, n2 = 1, siguiente;
        int contadorPrimos = 0, contadorNoPrimos = 0;

        System.out.println("Numeros primos en los primeros 15 terminos de Fibonacci:");

        for (int i = 1; i <= 15; i++) {
            if (i == 1) {
                siguiente = n1;
            } else if (i == 2) {
                siguiente = n2;
            } else {
                siguiente = n1 + n2;
                n1 = n2;
                n2 = siguiente;
            }

            if (esPrimo(siguiente)) {
                System.out.println(siguiente);
                contadorPrimos++;
            } else {
                contadorNoPrimos++;
            }
        }

        System.out.println("\nCantidad de numeros primos: " + contadorPrimos);
        System.out.println("Cantidad de numeros no primos: " + contadorNoPrimos);
    }
}
