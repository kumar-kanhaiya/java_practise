import java.util.Scanner;

public class swappingTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to the number swapping program \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int temp = first;
        first = second;
        second = temp;
        System.out.println("Now, After swapping first number is : " + first);
        System.out.println("Now, After swapping second number is : " + second);
        System.out.println("Thanks for using swapping program");

    }
}
