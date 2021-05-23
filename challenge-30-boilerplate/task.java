import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        int a=0;
        Scanner o=new Scanner(System.in);
        do{
            System.out.println("Enter the operation you wish to perform\n1.)Mathematical Calculation\n2.)Scientific Calculation\n3.)Exit");
            try{
            a=o.nextInt();
            if(a==0){
                throw new ArithmeticException();
            }
            if(a==1){
                Math_Calculator m=new Math_Calculator();
            }
            else if(a==2){
                scientific s=new scientific();
            }
        }catch(ArithmeticException e){
            System.out.println("You have entered an incorrect input");
        }
        }while(a<3);
    }
}
