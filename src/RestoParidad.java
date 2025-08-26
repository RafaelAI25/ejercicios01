import java.util.Scanner;


public class RestoParidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        int n = sc.nextInt();


        int resto = n % 2; // Módulo: 0 si es par, 1 o -1 si es impar
        System.out.println("Resto al dividir entre 2: " + resto);
        sc.close();
    }
}