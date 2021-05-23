// CHALLENGE-16

import java.util.Scanner;
import java.util.Arrays;
class task1   
{
    public static void main(String[]args)
    {
        int number,i,b=0,c=0;
        String[] words;
        int[] len,a;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number the words");
        number=o.nextInt();
        words=new String[number];
        len=new int[number];
        a=new int[number];
        System.out.println("Enter the words");
        for(i=0;i<number;i++)
        {
            words[i]=o.next();
            len[i]=words[i].length();
            a[i]=len[i];
        }
        Arrays.sort(a);
        b=a[0];
       for(i=0;i<number;i++)
        {
            if(b==len[i])
            {
                c=i;
            }       
        }
        System.out.println("The Shortest word is "+words[c]);
    }
}

