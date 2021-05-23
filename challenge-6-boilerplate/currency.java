// CHALLENGE-6

import java.util.Scanner;
class currency   
{
    public static void main(String[]args)
    {
        final double USD=74.3,GBP=94.5,JPY=0.67,EUR=85.37,AED=20.25;
        String currencytype;
        double b;
        int amount;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the currency type");
        currencytype=o.next();
        System.out.println("Enter the amount");
        amount=o.nextInt();
        switch(currencytype)
        {
            case "USD":
            {
                b=USD*amount;
                System.out.println("The Exchange rate for "+amount+" "+currencytype+" is: "+b);
                break;
            }
            case "GBP":
            {
                b=GBP*amount;
                System.out.println("The Exchange rate for "+amount+" "+currencytype+" is: "+b);
                break;
            }
            case "JPY":
            {
                b=JPY*amount;
                System.out.println("The Exchange rate for "+amount+" "+currencytype+" is: "+b);
                break;
            }
            case "EUR":
            {
                b=EUR*amount;
                System.out.println("The Exchange rate for "+amount+" "+currencytype+" is: "+b);
                break;
            }
            case "AED":
            {
                b=AED*amount;
                System.out.println("The Exchange rate for "+amount+" "+currencytype+" is: "+b);
                break;
            }
            default:
            {
                System.out.println(" Incorrect currencytype ");
            }
        }
    }
}



