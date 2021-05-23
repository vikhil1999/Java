// CHALLENGE-11

import java.util.Scanner;
class task   
{
    public static void main(String[]args)
    {
        int number,i,j=0;
        int[] roll;
        float b=0,avgmath=0,avgsocial=0,avgenglish=0,avglan=0,avgscience=0;
        float[] math,social,english,lan,science,total;
        String[] names;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number of students");
        number=o.nextInt();
        total=new float[number];
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
            avgmath+=math[i];
            avgsocial+=social[i];
            avgenglish+=english[i];
            avglan+=lan[i];
            avgscience+=science[i];
            if(b<total[i])
            {
                b=total[i];
                j=i;
            }
        }   
            avgmath/=number;
            avgsocial/=number;
            avgenglish/=number;
            avglan/=number;
            avgscience/=number;    
        System.out.println("The top scorer of the class is "+names[j]+" and rollno. is "+roll[j]);
    }
}

