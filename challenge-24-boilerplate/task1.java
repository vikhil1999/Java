import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class task1 {

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
        class1 t1=new class1();
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
        }        
        for(i=0;i<number;i++)
        {
            a=t1.numbercleared(math[i],social[i],english[i],lan[i],science[i],i,names[i],roll[i]);
        }
        d=number-a;
        System.out.println(d+" students need to mandatorily repeat the examination");
        for(i=0;i<number;i++)
        {
            t1.numbernotcleared(math[i],social[i],english[i],lan[i],science[i],i,names[i],roll[i]);
        }
    }
}
class class1{
    int k=0;
    public int numbercleared(float a,float b,float c,float d,float e,int i,String names,int roll)
    {
        if(a>=35)
        {
            if(b>=35)
            {
                if(c>=35)
                {
                    if(d>=35)
                    {
                        if(e>35)
                        {
                            k++;                                
                        }
                    }
                }
            }
        }
        if(a>=35)
        {
            if(b>=35)
            {
                if(c>=35)
                {
                    if(d>=35)
                    {
                        if(e>35)
                        {                              
                        }
                    }
                }
            }
        }
        return k;
    }
    public void numbernotcleared(float a,float b,float c,float d,float e,int i,String names,int roll)
    {
        if(a<35)
        {
            System.out.println("Name of the student "+names+",Rollno "+roll); 
        }
        else if(b<35)
        {
            System.out.println("Name of the student "+names+",Rollno "+roll);   
        }
        else if(c<35)
        {
            System.out.println("Name of the student "+names+",Rollno "+roll);    
        }
        else if(d<35)
        {
            System.out.println("Name of the student "+names+",Rollno "+roll);    
        }
        else if(e<35)
        {
            System.out.println("Name of the student "+names+",Rollno "+roll);    
        }
    }
}
