package Recursividad;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Contar dígitos");
            System.out.println("2. Suma de dígitos");
            System.out.println("3. Máximo común divisior (MCD)");
            System.out.println("4. Invertir cadena");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("CONTAR DIGITOS");
                    int numero = Metodos.ValidarEntero(scanner, "Ingrese un entero positivo: ");
                    System.out.println("El número "+ numero +" tiene " + Metodos.ContarDigitos(numero) + " digitos");
                    break;
                case 2:
                    System.out.println("SUMAR DIGITOS");
                    numero = Metodos.ValidarEntero(scanner, "Ingrese un entero positivo: ");
                    System.out.println("La suma de los digitos es: " + Metodos.SumaDigitos(numero));
                    break;
                case 3:
                    System.out.println("MÁXIMO COMÚN DIVISOR");
                    int a = Metodos.ValidarEntero(scanner, "Ingrese entero positivo 1: ");
                    int b = Metodos.ValidarEntero(scanner, "Ingrese entero positivo 2: ");
                    System.out.println("El MCD entre " + a + " y " + b + " es: " + Metodos.MaximoComunDivisor(a,b)); 
                    break;
                case 4:
                    System.out.println("INVERTIR CADENA");
                    Scanner leer = new Scanner(System.in);
                    System.out.print("Ingrese una cadena: ");
                    String cadena = leer.nextLine();
                    System.out.println("La cadena invertida es: " + Metodos.InvertirCadena(cadena));
                     
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese un número válido");
                    break;
            }

        } while (opcion != 5);
        scanner.close();
    }
}