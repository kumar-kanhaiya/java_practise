import java.util.Scanner;

public class checkingTheNumberSign {
    public static void main(String[] args) {
        System.out.println("Welcome to the positive , negative and 0 number checker\n");
        Scanner sh = new Scanner(System.in);
        System.out.print("Enter your number for check : ");
        int number = sh.nextInt();
        if(number == 0){
            System.out.println("your number is Zero !!");
        } else if (number>0) {
            System.out.println("Your number is positive!!");
        }
        else{
            System.out.println("your number is negative !!");
        }
    }
}
