import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the odd even checker \n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        if(number%2 ==0){
            System.out.println("Your number is even !! ");
        }
        else{
            System.out.println("Your number is odd !! ");
        }
    }
}
