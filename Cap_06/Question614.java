package QuestoesJava;
import java.util.Scanner;
public class Question614 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor da base?");
        int base = input.nextInt();
        System.out.println("Qual o valor do expoente?");
        int exponent = input.nextInt();

        int result = integerPower(base, exponent);

        System.out.printf("%d ^ %d = %d",
                base, exponent, result);

        input.close();

    }
    public static int integerPower(int base, int exponent){
        int result = 1;
        for (int i = 1; i <= exponent; i++){
            result *= base;
        }
        return result;
    }
}
