// CHALLENGE-16-c

import java.util.Scanner;
import java.util.Arrays;
class task4   
{
    public static void main(String[]args)
    {   
        String str1;
        boolean i;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the string");
        str1=o.next();
        StringBuilder str2=new StringBuilder(str1).reverse();
        System.out.println(str2);
        i=str1.equals(str2.toString());
        if(i)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}