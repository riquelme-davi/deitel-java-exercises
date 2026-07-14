package QuestoesJava;
import java.util.Scanner;

public class Question615 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado 1: ");
        double side1 = input.nextDouble();
        System.out.println("Digite o tamamnho do lado 2: ");
        double side2 = input.nextDouble();

        System.out.printf("A hipotenusa é igual á: %.2f",
                hypotenuse(side1, side2));

        input.close();


    }
    public static double hypotenuse (double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
