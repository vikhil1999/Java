// CHALLENGE-9

import java.util.Scanner;
class task   
{
    public static void main(String[]args)
    {
        int presentday,after,a,b=0;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the current day of week");
        presentday=o.nextInt();
        System.out.println("Enter the no. of days from today:");
        after=o.nextInt();
        a=presentday+after;
        b=a%7;
        if(b==0)
        {
            b=7;
        }
        if(presentday<=7)
        {
        switch(b)
        {
            case 7:
            {
                System.out.println("It is Sunday");
                break;
            }
            case 1:
            {
                System.out.println("It is Monday");
                break;
            }
            case 2:
            {
                System.out.println("It is Tuesday");
                break;
            }
            case 3:
            {
                System.out.println("It is Wednesday");
                break;
            }
            case 4:
            {
                System.out.println("It is Thusday");
                break;
            }
            case 5:
            {
                System.out.println("It is Friday");
                break;
            }
            case 6:
            {
                System.out.println("It is Saturday");
                break;
            }
            case -1:
            {
                System.out.println("It is Saturday");
                break;
            }
            case -2:
            {
                System.out.println("It is Friday");
                break;
            }
            case -3:
            {
                System.out.println("It is Thusday");
                break;
            }
            case -4:
            {
                System.out.println("It is Wednessday");
                break;
            }
            case -5:
            {
                System.out.println("It is Tuesday");
                break;
            }
            case -6:
            {
                System.out.println("It is Monday");
                break;
            }

            default:
            {
                System.out.println("Invalid day");
                break;
            }
        }
        }
        else
        {
            System.out.println("Invalid day");
        }
    }
}

