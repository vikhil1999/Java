/**
 * task
 */
import java.util.Scanner;
public class task {

    public static void main(String[] args) 
    {
        int n,sum;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number till which you require the fibonacci series");
        n=o.nextInt();   
        sum=fibonacci(n);
    }
    public static int fibonacci(int n) {
        if(n<1) 
        {
            return 0;
        }
        int sum = 0;
        
        int a = 1;
        int b = 1;
        System.out.print(sum+","+a+",");
        for(int i=0;i<n;i++)
        {
            sum+=a;
            a=b;
            b=sum;
            System.out.print(sum+",");
        }       

        return sum;
    }
}