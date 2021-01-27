import java.util.Scanner;

public class Exercise1 {
    public static void main (String[]args){
        String Name;
        float PayR;
        int HrsWrk;
        float Sal;

        Scanner sc= new Scanner(System.in);

        System.out.print("Please enter your name ");
        Name = sc.nextLine();

        System.out.print("Please enter your pay rate ");
        PayR = sc.nextFloat();

        System.out.print("Please enter the number of hours that you've worked ");
        HrsWrk=sc.nextInt();

        Sal = PayR * HrsWrk;

        System.out.println("" +
                "");
        System.out.println("Name: "+Name);
        System.out.println("Pay Rate: "+PayR);
        System.out.println("Hours worked: "+HrsWrk);
        System.out.println("Your Salary is: "+Sal);

    }
}
