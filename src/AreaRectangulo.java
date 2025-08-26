import java.util.Scanner;
public class AreaRectangulo {
    public static void main(String[] args) {
        /**
         * 2) Área de un rectángulo
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();


        double area = base * altura; // Fórmula del área
        System.out.println("Área = " + area);
        sc.close();
    }
}
