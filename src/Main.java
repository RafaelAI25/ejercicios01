import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /**
         * 1) Suma de dos números
         * */
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("introduce el primer número entero: ");
        int a = sc.nextInt();

        System.out.println("Introduce el segundo número entero: ");
        int b = sc.nextInt();

        int suma = a + b;

        System.out.println("La suma es: " + suma);




        /**
         * 3) Celsius a Fahrenheit
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura en ºC: ");
        double c = sc.nextDouble();
        double f = c * 9.0 / 5.0 + 32; // Ojo con los decimales para evitar división entera
        System.out.println(c + " ºC son " + f + " ºF");


        /**
         * 4) Resto al dividir por 2
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        int n = sc.nextInt();


        int resto = n % 2; // Módulo: 0 si es par, 1 o -1 si es impar
        System.out.println("Resto al dividir entre 2: " + resto);

        /**
         * 5) Suma, producto y promedio de tres números
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        double a = sc.nextDouble();
        System.out.print("Número 2: ");
        double b = sc.nextDouble();
        System.out.print("Número 3: ");
        double c = sc.nextDouble();


        double suma = a + b + c;
        double producto = a * b * c;
        double promedio = suma / 3.0;


        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Promedio: " + promedio);


    }
}