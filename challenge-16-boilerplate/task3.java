// CHALLENGE-16-c

import java.util.Scanner;
import java.util.Arrays;
class task3   
{
    public static void main(String[]args)
    {   
        int number,i;
        String[] words;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number the words");
        number=o.nextInt();
        words=new String[number];
        System.out.println("Enter the words");
        for(i=0;i<number;i++)
        {
            words[i]=o.next();
        }
        Arrays.sort(words);
        System.out.println("The sorted array is");
        for(i=0;i<number;i++)
        {
            System.out.println(words[i]);
        }
    }
}
