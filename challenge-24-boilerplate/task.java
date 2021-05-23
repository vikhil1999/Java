import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class task {

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
        task1 t=new task1();
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
            j=t.findtopper(total[i],i);
            avgmath+=math[i];
            avgsocial+=social[i];
            avgenglish+=english[i];
            avglan+=lan[i];
            avgscience+=science[i];
        }        
        avgmath=t.avg(avgmath,number);
        avgsocial=t.avg(avgsocial,number);
        avgenglish=t.avg(avgenglish,number);
        avglan=t.avg(avglan,number);
        avgscience=t.avg(avgscience,number);
        System.out.println("The top scorer of the class is "+names[j]+" and rollno. is "+roll[j]);
        System.out.println("Names of students who cleared the exams");
        for(i=0;i<number;i++)
        {
            a=t.numbercleared(math[i],social[i],english[i],lan[i],science[i],i,names[i],roll[i]);
        }
        System.out.println(a+" students have cleared all the exams");
    }
}
class task1
{
    public Float findtotal(float a,float b,float c,float d,float e)
    {
        return a+b+c+d+e;            
    }
    public int findtopper(float a,int c) 
    {
        float b=0;
        int d=0;
        if(b<a)
        {
            b=a;
            d=c;
        }
        return d;
    }
    public float avg(float avg,int a)
        {
            return avg/a;
        }
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
                                System.out.println("Name of the student "+names+",Rollno "+roll);                               
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
        public char gradefinder(float a,int b,float c,String d)
        {
            if(a>=90)
            {
                System.out.println("The grade obtained by "+d+" is A for total marks of "+c+" and average marks is "+a);
                return 'A';
            }
            else if(a>=80&&a<90)
            {
                System.out.println("The grade obtained by "+d+" is B for total marks of "+c+" and average marks is "+a);
                return 'B';
            }
            else if(a>=70&&a<80)
            {
                System.out.println("The grade obtained by "+d+" is C for total marks of "+c+" and average marks is "+a);
                return 'C';
            }
            else if(a>=60&&a<70)
            {
                System.out.println("The grade obtained by "+d+" is D for total marks of "+c+" and average marks is "+a);
                return 'D';
            }
            else if(a>=50&&a<60)
            {
                System.out.println("The grade obtained by "+d+" is E for total marks of "+c+" and average marks is "+a);   
                return 'E';
            }
            else
            {
                System.out.println("The grade obtained by "+d+" is F for total marks of "+c+" and average marks is "+a);
                return 'F';
            }
        }
}