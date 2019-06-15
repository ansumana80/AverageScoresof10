
import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        // add 3 numbers, sum them and print the result
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, sum, ave;

        num1=0;  num2=0; num3=0; num4=0; num5=0; num6=0; num7=0; num8=0; num9=0; num10=0;
        sum=0; ave=0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("....Welcome....");


        System.out.println("User Enter First Number");
        num1=keyboard.nextInt();
        System.out.println("User Enter Second Number");
        num2=keyboard.nextInt();
        System.out.println("User Enter Third Number");
        num3=keyboard.nextInt();
        System.out.println("User Enter Fourth Number");
        num4=keyboard.nextInt();
        System.out.println("User Enter Fifth Number");
        num5=keyboard.nextInt();
        System.out.println("User Enter Sixth Number");
        num6=keyboard.nextInt();
        System.out.println("User Enter Seventh Number");
        num7=keyboard.nextInt();
        System.out.println("User Enter Eighth Number");
        num8=keyboard.nextInt();
        System.out.println("User Enter Ninth Number");
        num9=keyboard.nextInt();
        System.out.println("User Enter Tenth Number");
        num10=keyboard.nextInt();


        sum= num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        ave= sum/10;

        System.out.println("The ave of 10 numbers is: "+ave);

    }
}
