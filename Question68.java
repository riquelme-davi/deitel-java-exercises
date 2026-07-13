import java.util.Scanner;

public class Question68 {

public static double calculateCharges (double time){
    if (time <= 3)
        return 2;
    else {
        double price = 0.5 * (Math.ceil(time - 3)) + 2;
        if (price >= 10)
            return 10;
        else
            return price;
    }

}


    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double total = 0;
    while (true) {
        System.out.print("Quantas horas o cliente ficou estacionado? -1 para finalizar o dia ");
        double hours = input.nextDouble();
        if (hours >= 0) {
            System.out.printf("O valor total a pagar é: R$ %.2f %n",
                    calculateCharges(hours));
            total += calculateCharges(hours);
        }
        else
            break;
    }
    System.out.printf("O total de tárifas de ontem é: %.2f",
            total);
    }
}
