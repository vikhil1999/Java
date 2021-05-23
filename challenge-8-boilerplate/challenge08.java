// CHALLENGE-8

import java.util.Scanner;
class challenge08   
{
    public static void main(String[]args)
    {
        int amount,share,conv;
        double a,newshare,tax,profit,oldprice=40;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the amount invested by the company:");
        amount=o.nextInt();
        System.out.println("Enter the share price of the company:");
        share=o.nextInt();
        a=amount*74.3;
        System.out.format("Investment amount after increase in exchange rate : %.2f",a);
        System.out.println("");
        newshare=74.3*(share/oldprice);
        System.out.format("The new price of the stock : %.2f",newshare);
        System.out.println("");
        tax=a/10;
        System.out.format("The tax to be paid on the total shares is : %.2f",tax);
        System.out.println("");
        profit=a-tax;
        System.out.format("The total profit in INR : %.2f",profit);
        System.out.println("");
        conv=(int)(profit/74.3);
        System.out.println("The total profit converted to dollars :"+conv);
    }
}




