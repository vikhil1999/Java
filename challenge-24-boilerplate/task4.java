import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class task4 {

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
        class4 t=new class4();
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
            total[i]=t.findtotal(math[i],social[i],english[i],lan[i],science[i]);
            avg[i]=total[i]/5;
        }     
        System.out.println("Representing the average of student using histogram using asterisk('*') symbol");
        t.graph(avg,number,roll);
    }
}
class class4
{
    public Float findtotal(float a,float b,float c,float d,float e)
    {
        return a+b+c+d+e;            
    }
    public void graph(float[] avg,int number,int[] roll)
    {
        int i,j;
        for(i=10;i>=1;i--)
        {System.out.format("%d\t",i*10);
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
        System.out.print("\t");
    for(i=0;i<number;i++)
    {
        System.out.print(roll[i]+"\t");
    }
    }
}