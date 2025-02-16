import java.util.Scanner;

public class inputNumber {

    public static double input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        double number = input.nextDouble();
        return number;
    }
}
