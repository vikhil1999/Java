// CHALLENGE-5

import java.util.Scanner;
class currency   
{
    public static void main(String[]args)
    {
        int i,a=1,amount;
        double USD,JPY,GBP,b,INR;
        char input;
        String output;
        Scanner o=new Scanner(System.in);
        System.out.println("INR\tUSD(in INR)\tGBP(in INR)\tJPY(in INR)");
        for(i=1;i<=10;i++)
        {
            USD=a*74.3;
            JPY=a*0.67;
            GBP=a*94.5;
            System.out.format("%d\t%.2f\t\t%.2f\t\t%.2f",a,USD,GBP,JPY);
            System.out.println();
            a=i*10;
        }
        System.out.println("Enter the name of currency which you want to convert");
        input=o.next().charAt(0);
        System.out.println("Enter the name of currency to which your currency should convert");
        output=o.next();
        System.out.println("Enter the amount");
        amount=o.nextInt();
        if(input=='U')
        {
            switch(output)
            {
                case "INR":
                {
                    b=amount*74.3;
                    System.out.println("The Exchange value of INR for "+amount+"USD"+" is "+b);
                    break;
                }
                case "JPY":
                {
                    b=amount*103.74;
                    System.out.println("The Exchange value of JPY for "+amount+"USD"+" is "+b);
                    break;
                }
                case "GBP":
                {
                    b=amount*0.74;
                    System.out.println("The Exchange value of GBP for "+amount+"USD"+" is "+b);
                    break;
                }
                default:
                {
                    System.out.println("Invalid output convertion");
                }
            }
        }
        else if(input=='G')
        {
            switch(output)
            {
                case "INR":
                {
                    b=amount*98.77;
                    System.out.println("The Exchange value of INR for "+amount+"GBP"+" is "+b);
                    break;
                }
                case "JPY":
                {
                    b=amount*139.34;
                    System.out.println("The Exchange value of JPY for "+amount+"GBP"+" is "+b);
                    break;
                }
                case "USD":
                {
                    b=amount*1.34;
                    System.out.println("The Exchange value of JPY for "+amount+"GBP"+" is "+b);
                    break;

                }
                default:
                {
                    System.out.println("Invalid output convertion");
                }
            }
        }
        else if(input=='I')
        {
            switch(output)
            {
                case "USD":
                {
                    b=amount*0.014;
                    System.out.println("The Exchange value of USD for "+amount+"INR"+" is "+b);
                    break;
                }
                case "JPY":
                {
                    b=amount*1.41;
                    System.out.println("The Exchange value of JPY for "+amount+"INR"+" is "+b);
                    break;
                }
                case "GBP":
                {
                    b=amount*0.01;
                    System.out.println("The Exchange value of GBP for "+amount+"INR"+" is "+b);
                    break;

                }
                default:
                {
                    System.out.println("Invalid output convertion");
                }
            }
        }
        else if(input=='J')
        {
            switch(output)
            {
                case "INR":
                {
                    b=amount*0.71;
                    System.out.println("The Exchange value of INR for "+amount+"JPY"+" is "+b);
                    break;
                }
                case "USD":
                {
                    b=amount*0.0096;
                    System.out.println("The Exchange value of USD for "+amount+"JPY"+" is "+b);
                    break;
                }
                case "GBP":
                {
                    b=amount*0.072;
                    System.out.println("The Exchange value of INR for "+amount+"JPY"+" is "+b);
                    break;
                }
                default:
                {
                    System.out.println("Invalid output convertion");
                }
            }
        }
        else
        {
            System.out.println("Invalid input type");
        }
    }
}



