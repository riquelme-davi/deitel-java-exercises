package QuestoesJava;
import java.util.Scanner;


public class Question617 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.print("Digite o número (-1 para sair): ");
        int number = input.nextInt();
        if (number == -1)
                    break;
        System.out.printf("Número: %d %n" +
                        "Par: %b %n"
                , number, isEven(number));
}
        input.close();

    }

    public static boolean isEven(int number){
        return (number%2)==0;
    }
}
