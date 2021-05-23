// CHALLENGE-15

import java.util.Scanner;
import java.util.Arrays;
class task   
{
    public static void main(String[]args)
    {
        int robbers,startingnumber,gap,i,j=0,c=1,d=0;
        int[] a,b;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the No. of Robbers");
        robbers=o.nextInt();
        a=new int[robbers];
        b=new int[robbers];
        System.out.println("Enter The Robber with whom Sam will start shooting:");
        startingnumber=o.nextInt();
        System.out.println("Enter the gap between the robbers:");
        gap=o.nextInt();
        for(i=0;i<robbers;i++)
        {
            a[i]=i+1;
        }
        while(j<robbers)
        {
            for(i=startingnumber-c;i<robbers;i++)
            {
                if(d==0)
                {
                    b[j]=a[i];
                    j++;
                    System.out.println("Target= "+a[i]+" ,"+j+" shots completed");
                    a[i]=0;
                    Arrays.sort(a);
                    d=gap+1;
                }
                d--;
            }
            c=0;
            startingnumber=j;
        }
        System.out.println(j+" shots taken");
        System.out.println("The shootout sequence are");
        for(i=0;i<robbers;i++)
        {
            System.out.print(b[i]+",");
        }
    }
}
        
