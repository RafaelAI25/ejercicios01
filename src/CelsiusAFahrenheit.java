import java.util.Scanner;


public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura en ºC: ");
        double c = sc.nextDouble();
        double f = c * 9.0 / 5.0 + 32; // Ojo con los decimales para evitar división entera
        System.out.println(c + " ºC son " + f + " ºF");
        sc.close();
    }
}
