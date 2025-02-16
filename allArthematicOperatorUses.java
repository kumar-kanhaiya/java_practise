import java.util.Scanner;

public class allArthematicOperatorUses {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int firstNumber = (int)inputNumber.input();
        int secondNumber = (int) inputNumber.input();
        System.out.println("Enter 1 for Addition , 2 for subtraction " +
                ", 3 for multiplication , 4 for division ");
        int choose =(int) inputNumber.input();
        switch (choose){
            case 1 :
                System.out.println(firstNumber + secondNumber);
                break;
            case 2:
                System.out.println(firstNumber - secondNumber);
                break;
            case 3:
                System.out.println(firstNumber*secondNumber);
                break;
            case 4 :
                System.out.println(firstNumber/secondNumber);
                break;
        }

    }
}
