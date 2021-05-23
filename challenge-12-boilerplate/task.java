// CHALLENGE-12

import java.util.Scanner;
class task   
{
    public static void main(String[]args)
    {
        int number,i,j=0,k=0;
        int[] roll;
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
        }
        for(i=0;i<number;i++)
        {
            if(math[i]>=35)
            {
                if(social[i]>=35)
                {
                    if(english[i]>=35)
                    {
                        if(lan[i]>=35)
                        {
                            if(science[i]>35)
                            {
                                j++;                                
                            }
                        }
                    }
                }
            }
        }
        System.out.println(j+" students have cleared all the exams");
        for(i=0;i<number;i++)
        {
            if(math[i]>=35)
            {
                if(social[i]>=35)
                {
                    if(english[i]>=35)
                    {
                        if(lan[i]>=35)
                        {
                            if(science[i]>35)
                            {
                                System.out.println("Name of the student\tRollno.");
                                System.out.println("\t"+names[i]+"\t\t"+roll[i]);                               
                            }
                        }
                    }
                }
            }
        }
        k=number-j;
        System.out.println(k+"students need to mandatorily repeat the examination");
        for(i=0;i<number;i++)
        {
            if(math[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(social[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(english[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(lan[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(science[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
        }
    }
            

}

