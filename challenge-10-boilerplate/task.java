// CHALLENGE-10

import java.util.Scanner;
class task   
{
    public static void main(String[]args)
    {
        int month,year,weekday,a=0,i,j,b=0,c=1;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the month number");
        month=o.nextInt();
        System.out.println("Enter the year");
        year=o.nextInt();
        System.out.println("Enter the day of the week");
        weekday=o.nextInt();
        System.out.println("\t\t  Calendar");
        System.out.println("S\tM\tTu\tW\tTh\tF\tS");
        if(weekday==7)
        {
            weekday=0;
        }
        if(month!=2)
        {
        switch(month)
        {
            case 1:
            {
                a=31;
                break;
            }
            case 3:
            {
                a=31;
                break;
            }
            case 4:
            {
                a=30;
                break;
            }
            case 5:
            {
                a=31;
                break;
            }
            case 6:
            {
                a=30;
                break;
            }
            case 7:
            {
                a=31;
                break;
            }
            case 8:
            {
                a=31;
                break;
            }
            case 9:
            {
                a=30;
                break;
            }
            case 10:
            {
                a=31;
                break;
            }
            case 11:
            {
                a=30;
                break;
            }
            case 12:
            {
                a=31;
                break;
            }
        }
        }
        else
        {
            if(year%400==0)
            {
                a=29;
            }
            else if(year%100==0)
            {
                a=28;
            }
            else if(year%4==0)
            {
                a=29;
            }
            else
            {
                a=28;
            }
        }
        hello:
        for(i=0;i<6;i++)
        {
            for(j=0;j<7;j++)
            {
                if(b<weekday)
                {
                    System.out.print("\t");
                    b+=1;
                }
                else
                {
                    if(c<=a)
                    {
                    System.out.print(c+"\t");
                    c+=1;
                    }
                    else
                    {
                        break hello;
                    }
                }
            }
            System.out.println();
        }
    }
}
