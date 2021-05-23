import java.lang.Math;
import java.util.Scanner;
/**
 * scientific
 */
public class scientific {
    int a,b,result;
    double c,d,result1;
    public scientific(){
        scienticalc();
    }
    public void scienticalc(){
        do{
        System.out.println("Select an Scientific operation\n1.)Ceil\n2.)Floor\n3.)Square Root\n4.)Power of\n5.)Main Menu");
        Scanner o=new Scanner (System.in);
        try{
        a=o.nextInt();
        switch(a){
            
            case 1:{
                System.out.println("Enter the number");
                c=o.nextFloat();
                if(c<=0){
                    throw new ArithmeticException();
                }
                result1=Math.ceil(c);
                System.out.println("The Ceil value of "+c+" is "+result1);
                break;
            }
            case 2:{
                System.out.println("Enter the number");
                c=o.nextFloat();
                if(c<=0){
                    throw new ArithmeticException();
                }
                result1=Math.floor(c);
                System.out.println("The Floor value of "+c+" is "+result1);
                break;
            }
            case 3:{
                System.out.println("Enter the number");
                c=o.nextFloat();
                if(c<=0){
                    throw new ArithmeticException();
                }
                result1=Math.sqrt(c);
                System.out.println("The Square root  value of "+c+" is "+result1);
                break;
            }
            case 4:{
                System.out.println("Enter the base number");
                a=o.nextInt();
                System.out.println("Enter the power");
                b=o.nextInt();
                if(a<=0||b<=0){
                    throw new ArithmeticException();
                }
                result1=Math.pow(a,b);
                System.out.println("The value of "+a+" to the power of "+b+" is "+(int)result1);
                break;
            }
        }
        }catch(ArithmeticException e){
            System.out.println("The number should not be 0 or less than 0");
        }
        }while(a<5);

    }
    
}