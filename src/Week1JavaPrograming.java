import java.util.Scanner;

public class Week1JavaPrograming {

    public static void main(String[]args) {
        int num1, num2;

        Scanner sc= new Scanner(System.in);

        System.out.print("Please enter your first number");
        num1=sc.nextInt();

        System.out.print("Please enter your second number");
        num2=sc.nextInt();

        int sum= num1+num2;

        System.out.println("The sum of the two numbers is: "+ sum);
    }
}
