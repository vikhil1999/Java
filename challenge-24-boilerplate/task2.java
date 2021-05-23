import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class task2 {

    public static void main(String[] args) 
    {
        int number,j=0,i,a=0,d=0,e=0;
        int[] roll;
        float b=0,avgmath=0,avgsocial=0,avgenglish=0,avglan=0,avgscience=0;
        float[] avg,math,social,english,lan,science,total;
        String[] names;
        char[] avggrade;
        Character[] grade;
        Scanner o=new Scanner(System.in);
        class2 c2=new class2();
        System.out.println("Enter the number of students");
        number=o.nextInt();
        total=new float[number];
        avg=new float[number];
        avggrade=new char[number];
        grade=new Character[number];
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
            total[i]=c2.findtotal(math[i],social[i],english[i],lan[i],science[i]);
            avg[i]=total[i]/5;
        }        
        for(i=0;i<number;i++)
        {
            avggrade[i]=c2.gradefinder(avg[i],5,total[i],names[i]);
            grade[i]=avggrade[i];
        }
    }
}
class class2
{
    public Float findtotal(float a,float b,float c,float d,float e)
    {
        return a+b+c+d+e;            
    }
    public char gradefinder(float a,int b,float c,String d)
        {
            if(a>=90)
            {
                return 'A';
            }
            else if(a>=80&&a<90)
            {
                return 'B';
            }
            else if(a>=70&&a<80)
            {
                return 'C';
            }
            else if(a>=60&&a<70)
            {
                return 'D';
            }
            else if(a>=50&&a<60)
            {   
                return 'E';
            }
            else
            {
                return 'F';
            }
        }
}