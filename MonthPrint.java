//Java program to print Month Names by giving input as an Integer

import java.util.Scanner;

public class MonthPrint {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        switch(num)
        {
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            case default :
                System.out.println("Please Enter Number between 1 to 12");
        }
    }

}
