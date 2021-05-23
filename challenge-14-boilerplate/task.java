// CHALLENGE-14

import java.util.Scanner;
class task   
{
    public static void main(String[]args)
    {
        int number,i,j;
        int[] roll;
        float[] math,social,english,lan,science,avg,total;
        String[] names;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number of students");
        number=o.nextInt();
        total=new float[number];
        avg=new float[number];
        roll=new int[number];
        math=new float[number];
        social=new float[number];
        english=new float[number];
        lan=new float[number];
        science=new float[number];
        names=new String[number];
        for(i=0;i<number;i++)
        {
            System.out.println("Enter the name");
            names[i]=o.next();
            System.out.println("Enter the rolln.o");
            roll[i]=o.nextInt();
            System.out.println("Enter the marks scored by "+names[i]+" in math");
            math[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in social");
            social[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in english");
            english[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in language");
            lan[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in science");
            science[i]=o.nextFloat();
            total[i]=math[i]+social[i]+english[i]+lan[i]+science[i];
            avg[i]=total[i]/5;
        }
        System.out.println("Representing the average of student using histogram using asterisk('*') symbol");
        for(i=9;i>=1;i--)
        {
            for(j=0;j<number;j++)
            {
                if(avg[j]>=i*10)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        for(i=1;i<=number;i++)
        {
            System.out.print(i+"\t");
        }
    }
}
