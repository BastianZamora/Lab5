package Recursividad;
import java.util.Scanner;

public class Metodos {
    public static int ValidarEntero(Scanner scanner, String texto){
        int valor;
        do {
            System.out.print(texto);
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                scanner.next();
            }
            valor = scanner.nextInt();
        } while (valor <= 0);
        return valor;
    }

    public static int ContarDigitos(long num){
        if (num < 10) {
            return 1;
        } else {
            return 1 + ContarDigitos(num / 10);
        }
    }

    public static long SumaDigitos(long suma){
        if (suma < 10) {
            return suma;
        } else {
            return suma%10 + SumaDigitos(suma / 10);
        }
    }

    public static int MaximoComunDivisor(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return MaximoComunDivisor(b, a % b);
        }
    }

    public static String InvertirCadena(String cadena){
        if (cadena.length() <= 1) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + InvertirCadena(cadena.substring(0, cadena.length() - 1));
    }
}
