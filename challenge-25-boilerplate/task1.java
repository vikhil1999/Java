import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class task1 {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        int number=0,i,roll,c=0,d=0,j=0;
        float b=0,avgmath=0,avgsocial=0,avgenglish=0,avglan=0,avgscience=0;
        float avg,math,social,english,lan,science,total;
        String names;
        char[] avggrade;
        Character[] grade;
        System.out.println("Enter the number of students");
        number=o.nextInt();
        avggrade=new char[number];
        grade=new Character[number];
        student[] s=new student [number];
        for(i=0;i<number;i++)
        {
            System.out.println("Enter the name");
            names=o.next();
            System.out.println("Enter the rolln.o");
            roll=o.nextInt();
            System.out.println("Enter the marks scored by "+names+" in math");
            math=o.nextFloat();
            System.out.println("Enter the marks scored by "+names+" in social");
            social=o.nextFloat();
            System.out.println("Enter the marks scored by "+names+" in english");
            english=o.nextFloat();
            System.out.println("Enter the marks scored by "+names+" in language");
            lan=o.nextFloat();
            System.out.println("Enter the marks scored by "+names+" in science");
            science=o.nextFloat();
            s[i]=new student(names,roll,math,social,english,lan,science);
        }
        for(i=0;i<number;i++)
        {
            if(b<s[i].gettotal())
            {
                b=s[i].gettotal();
                c=i;
            }
        }
        System.out.println("The top scorer of the class is "+s[c].getname()+" and rollno. is "+s[c].getrollnumber());
        System.out.println("Names of students who cleared the exams");
        for(i=0;i<number;i++)
        {
            c=s[i].numbercleared();  
        }
        System.out.println(c+" students have cleared all the exams");
        d=number-c;
        System.out.println(d+" students need to mandatorily repeat the examination");
        for (i = 0; i < number; i++) {
            s[i].numbernotcleared();
        }
        for(i=0;i<number;i++)
        {
            avggrade[i]=s[i].gradefinder();
            grade[i]=avggrade[i];
        }
        Arrays.sort(grade,Collections.reverseOrder());
        System.out.println("Enter the Rollnumber to display the details");
        d=o.nextInt();
        for(i=0;i<number;i++)
        {
            if(d==s[i].getrollnumber())
            {
                s[i].displaydetails();
            }
        }
        System.out.println("Representing the average of student using histogram using asterisk('*') symbol");
            for(i=9;i>=1;i--)
            {
            for(j=0;j<number;j++)
            {
                if(s[j].getaverage()>=i*10)
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
        for(i=0;i<number;i++)
        {
            System.out.print(s[i].getrollnumber()+"\t");
        }        
    }
}
