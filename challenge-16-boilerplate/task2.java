// CHALLENGE-16-b

import java.util.Scanner;
import java.util.Arrays;
class task2   
{
    public static void main(String[]args)
    {   
        int number,i,b=0;
        String[] words;
        String a;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number the words");
        number=o.nextInt();
        words=new String[number];
        System.out.println("Enter the words");
        for(i=0;i<number;i++)
        {
            words[i]=o.next();
        }
        System.out.println("Enter the word to be searched");
        a=o.next();
        for(i=0;i<number;i++)
        {
            if(a.equals(words[i]))
            {
                b++;
            }
        }
        if(b>=1)
        {
            System.out.println("The word is present in the list ");
        }
        else
        {
            System.out.println("The word is not present in the list");
        }
    }
}
