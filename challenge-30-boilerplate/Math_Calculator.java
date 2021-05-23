import java.util.Scanner;
import java.lang.ArithmeticException;

/**
 * Math_Calculator
 */
public class Math_Calculator {
    int result,c,d,a,b;
    float result1,e,f;
    public Math_Calculator(){
        Calculator();
    }
    public void Calculator(){
        do{
            System.out.println("Select an arithmetic operation :\n1.)Add\n2.)Subtract\n3.)Multiply\n4.)Divide\n5.)Modulo\n6.)Main Menu");
            Scanner o=new Scanner(System.in);
            c=o.nextInt();    
            switch (c){
                case 1:
                {
                    System.out.println("Enter 1 for integer addition, 2 for decimal addition");
                    d=o.nextInt();
                    if(d==1){
                        System.out.println("Enter the 1st number");
                        a=o.nextInt();
                        System.out.println("Enter the 2st number");
                        b=o.nextInt();
                        intadd(a, b);    
                    }
                    else if(d==2){
                        System.out.println("Enter the 1st number");
                        e=o.nextInt();
                        System.out.println("Enter the 2st number");
                        f=o.nextInt();
                        decimaladd(e, f);
                    }
                    else{
                        System.out.println("Incorrect number entered");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter 1 for integer subtraction, 2 for decimal subtraction");
                    d=o.nextInt();
                    if(d==1){
                        System.out.println("Enter the 1st number");
                        a=o.nextInt();
                        System.out.println("Enter the 2st number");
                        b=o.nextInt();
                        intsubtract(a, b);    
                    }
                    else if(d==2){
                        System.out.println("Enter the 1st number");
                        e=o.nextInt();
                        System.out.println("Enter the 2st number");
                        f=o.nextInt();
                        decimalsubtract(e, f);
                    }
                    else{
                        System.out.println("Incorrect number entered");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter 1 for integer Multiplication, 2 for decimal multiplication");
                    d=o.nextInt();
                    if(d==1){
                        System.out.println("Enter the 1st number");
                        a=o.nextInt();
                        System.out.println("Enter the 2st number");
                        b=o.nextInt();
                        intmultiply(a, b);    
                    }
                    else if(d==2){
                        System.out.println("Enter the 1st number");
                        e=o.nextInt();
                        System.out.println("Enter the 2st number");
                        f=o.nextInt();
                        decimalmultiply(e, f);
                    }
                    else{
                        System.out.println("Incorrect number entered");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Enter 1 for integer division, 2 for decimal division");
                    d=o.nextInt();
                    try{
                    if(d==1){
                        System.out.println("Enter the 1st number");
                        a=o.nextInt();
                        System.out.println("Enter the 2st number");
                        b=o.nextInt();
                        if(b==0){
                            throw new ArithmeticException();   
                        } 
                        intdivision(a, b);
                    }
                    else if(d==2){
                        System.out.println("Enter the 1st number");
                        e=o.nextInt();
                        System.out.println("Enter the 2st number");
                        f=o.nextInt();
                        if(f==0){
                            throw new ArithmeticException();   
                        }
                        decimaldivision(e, f);
                    }
                    else{
                        System.out.println("Incorrect number entered");
                    }
                    }catch(ArithmeticException e){
                        System.out.println("You should not divide the number by Zero");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Enter 1 for integer modulo, 2 for decimal modulo");
                    d=o.nextInt();
                    if(d==1){
                        System.out.println("Enter the 1st number");
                        a=o.nextInt();
                        System.out.println("Enter the 2st number");
                        b=o.nextInt();
                        intmodulo(a, b);    
                    }
                    else if(d==2){
                        System.out.println("Enter the 1st number");
                        e=o.nextInt();
                        System.out.println("Enter the 2st number");
                        f=o.nextInt();
                        decimalmodulo(e, f);
                    }
                    else{
                        System.out.println("Incorrect number entered");
                    }
                    break;
                }

            }
        }while(c<6);
    }

    public void intadd(int a,int b){
        result=a+b;
        System.out.println("The addition of "+a+" and "+b+" is : "+result);
    }
    public void decimaladd(float a,float b){
        result1=a+b;
        System.out.println("The addition of "+a+" and "+b+" is : "+result1);
    }
    public void intsubtract(int a,int b){
        result=a-b;
        System.out.println("The subtraction of "+a+" and "+b+" is : +"+result);
    }
    public void decimalsubtract(float a,float b){
        result1=a-b;
        System.out.println("The subtraction of "+a+" and "+b+" is : +"+result1);
    }
    public void intmultiply(int a,int b){
        result=a*b;
        System.out.println("The Multiplication of "+a+" and "+b+" is : +"+result);
    }
    public void decimalmultiply(float a,float b){
        result1=a*b;
        System.out.println("The Multiplication of "+a+" and "+b+" is : +"+result1);
    }
    public void intdivision(int a,int b){
        result=a/b;
        System.out.println("The Division of "+a+" and "+b+" is : "+result);
    }
    public void decimaldivision(float a,float b){
        result1=a/b;
        System.out.println("The Division of "+a+" and "+b+" is : "+result1);
    }
    public void intmodulo(int a,int b){
        result=a%b;
        System.out.println("The Modulo of "+a+" and "+b+" is : "+result);
    }
    public void decimalmodulo(float a,float b){
        result1=a%b;
        System.out.println("The Modulo of "+a+" and "+b+" is : "+result1);
    }


}