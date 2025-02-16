import java.util.Scanner;

public class WhileLoopChallenge {
    public static void main(String[] args) {
//        MultiplicationTable();
//        sumOfAllOddNumber();
//            factorial(5);
//        sumOfDigit();
//        LCM();
//        GCD();
//        isPrime();
//        reverseTheDigit();
        FibonacciSeries(80);
//        ArmstrongNumber();
        Palindrome();
    }
    public static void MultiplicationTable(){
        System.out.println("Welcome to the Multiplication Table Generator \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number for table : ");
        int number = input.nextInt();
        int i = 1 ;
        while(i<=10){
            System.out.println(number + " * " + i + " = " + number*i);
            i++;
        }
    }

    public static void sumOfAllOddNumber(){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your last number : ");
        int number = input.nextInt();
        int i = 0 ;
        while(i<number){
            if(i%2 != 0){
                sum+= i;

            }
            i++;
        }
        System.out.println(sum);
    }
    public static void factorial(int number){
        System.out.println("Welcome to the factorial checker \n");
        int real = number;
        int product = 1;
        while(number!=1){
            if(number<=0){
                System.out.println(1);
            }
            product = product * number;
            number --;
        }
        System.out.printf("Factorial of %d is : %d" , real , product);
    }
    public static void sumOfDigit(){
        System.out.println("Welcome to the sumOfDigit of integer generator ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        int i = 0;
        int reminder = 0;
        while(number>=1){
            int tryy = number%10;
            reminder +=  tryy;
            number /=10;
        }
        System.out.println(reminder);

    }
    public static void LCM(){
        System.out.println("Welcome to the Least Common Multiple Generator \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number  : ");
        int first = input.nextInt();
        System.out.print("please enter your second number : ");
        int second = input.nextInt();
        int  i =1;
        while(i<= second){
            int product = first * i;
            if(product%second == 0 ){
                System.out.print("Least Common Multiple  is : " + product);
                break;
            }
            i++;
        }
    }
    public static void GCD(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Greatest Common Divisor Program \n");
        System.out.print("Enter your first number : ");
        int first = input.nextInt();
        System.out.print("Enter your second number : ");
        int second = input.nextInt();
        int i = 0;
        int num = 1;
        while(num<first){
            if(first%num == 0 && second%num ==0){
                i = num;
            }
            num++;
        }
        System.out.println("the Gcd of "  + first + " & " + second + " number is " + i);
    }
    public static void isPrime(){
        System.out.println("Welcome to the Prime number checker \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        int i = 2;
        boolean isPrime = true;
        while(i<=number/2){
            if (number % i == 0) {
                isPrime =  false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println("this is a prime number ");
        }
        else{
            System.out.println("this is not a prime number ");
        }
    }
    public static void reverseTheDigit(){
        System.out.println("Welcome to the reverseTheDigit Generator \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int real = number;
        int reminder = 0 ;
        while(number>= 1 ){
            int tryy = number%10;
            reminder = reminder *10 + tryy;
            number /= 10;

        }
        System.out.println("Before reverse :  " + real);
        System.out.print("After reverse : " + reminder);

    }
    public static void FibonacciSeries(int number ){
        if(number<0)return;
        System.out.print("0");
        if(number== 0)return;
        System.out.print(" 1 ");
        int first = 0;
        int second = 1;
        while(first + second <= number){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
    public static void ArmstrongNumber(){
        System.out.println("Welcome to the armstrong number checker \n ");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number for check : ");
        int number = input.nextInt();
        int real = number;
        int reminder = 0;
        while(number>=1){
            int tryy  =  number%10;
            reminder  = reminder + tryy*tryy*tryy;
            number /= 10;
        }
        if(real == reminder){
            System.out.println("your number is Armstrong");
        }
        else{
            System.out.println("Your number is not armstrong");
        }
    }

    public static void Palindrome(){
        System.out.println("Welcome to the Palindrome Checker \n ");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int number = input.nextInt();
        int real = number;
        int reverse = 0;
        while(number>= 1 ){
            int tryy = number%10;
            reverse = reverse *10 + tryy;
            number /=10;

        }
        if(real == reverse){
            System.out.println("your number is palindrome");
        }
        else{
            System.out.println("your number is not palindrome");
        }

    }
    
}
