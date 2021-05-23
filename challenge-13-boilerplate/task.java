// CHALLENGE-13

import java.util.Scanner;
import java.util.Arrays;
class task   
{
    public static void main(String[]args)
    {
        int number,i,j=0,a;
        int[] roll;
        float[] math,social,english,lan,science,avg,total;
        String[] names;
        char[] avggrade,grade; 
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number of students");
        number=o.nextInt();
        total=new float[number];
        avg=new float[number];
        grade=new char[number];
        avggrade=new char[number];
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
            if(avg[i]>=95)
            {
                avggrade[i]='A';
            }
            else if(avg[i]>=80&&avg[i]<95)
            {
                avggrade[i]='B';
            }
            else if(avg[i]>=70&&avg[i]<80)
            {
                avggrade[i]='C';
            }
            else if(avg[i]>=60&&avg[i]<70)
            {
                avggrade[i]='D';
            }
            else if(avg[i]>=50&&avg[i]<60)
            {
                avggrade[i]='E';
            }
            else
            {
                avggrade[i]='F';
            }
        }
        for(i=0;i<number;i++)
        {
            System.out.println("The Grade obtained by "+names[i]+" is "+avggrade[i]+" for Total marks of "+total[i]+" with average marks of "+avg[i]);
            grade[i]=avggrade[i];
            System.out.println();
        }
        Arrays.sort(grade);
       /*for(i=0;i<number;i++)
        {
            System.out.println(Arrays.toString(grade[i]);
        }*/
        System.out.println("Enter the rollno.");
        a=o.nextInt();
        for(i=0;i<number;i++)
        {
            if(a==roll[i])    
            {        
            System.out.println("Name : "+names[i]);
            System.out.println("Rollno. : "+roll[i]);
            System.out.println("Marks obtained in math : "+math[i]);
            System.out.println("Marks obtained in social : "+social[i]);
            System.out.println("Marks obtained in english : "+english[i]);
            System.out.println("Marks obtained in language : "+lan[i]);
            System.out.println("Marks obtained in science : "+science[i]);
            System.out.println("Total marks obtained : "+total[i]);
            System.out.println("Grade obtained : "+avggrade[i]);
            }
        }
    }
}

