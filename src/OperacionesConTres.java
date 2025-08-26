import java.util.Scanner;


public class OperacionesConTres {
    public static void main(String[] args) {
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
        sc.close();
    }
}
