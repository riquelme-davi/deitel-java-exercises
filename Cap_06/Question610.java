package QuestoesJava;
import java.util.Scanner;

public class Question610 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Para qual casa decimal deseja arredondar? \n 1 - Inteiro \n 2 - Décimo  \n 3 - Centésimo \n 4 - Milésimo");
        int choice = input.nextInt();

        System.out.println("Digite o número que deseja arredondar: ");
        double originalNumber = input.nextDouble();
        double roundedNumber = 0;

        switch (choice) {
            case 1:
                roundedNumber = roundToInteger(originalNumber);
                break;
            case 2:
                roundedNumber = roundToTenths(originalNumber);
                break;
            case 3:
                roundedNumber = roundToHundredths(originalNumber);
                break;
            case 4:
                roundedNumber = roundToThousandths(originalNumber);
                break;
            default:
                System.out.print("Opção inválida");
                input.close();
                return;
        }
        System.out.printf("Número original: %.2f %nNúmero arredondado: %.0f",
                originalNumber, roundedNumber);

        input.close();

    }
    public static double roundToInteger(double number){
        return Math.floor(number+0.5);
    }
    public static double roundToTenths(double number){
        return Math.floor(number*10+0.5)/10;
    }
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

}
