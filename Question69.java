package QuestõesJava;
import java.util.Scanner;

public class Question69 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número para arredondamento: ");
        double originalNumber = input.nextDouble();
        double roundedNumber = Math.floor(originalNumber + 0.5);
        System.out.printf("Número original: %.2f %nNúmero arredondado: %.0f",
                originalNumber, roundedNumber);

        input.close();
    }
}