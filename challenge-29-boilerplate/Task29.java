import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        char a,b;
        String type;
        Scanner o= new Scanner(System.in);
        System.out.println("Enter Transmission Type(Enter M for Manual,A for Automatic)");
        a=o.next().charAt(0);
        if(a=='M'||a=='m'){
            System.out.println("Enter the model number");
            type=o.next();
            Manual M=new Manual(type);
            M.Showspecs();
        }
        else if(a=='A'||a=='a'){
            System.out.println("Enter the Automatic type(Enter e for automatic manual,c for Continuously,d for dual-clutch)");
            b=o.next().charAt(0);
            if(b=='e'||a=='E'){
                System.out.println("Enter the model number");
                type=o.next();
                AMT am= new AMT(type);
                am.Showspecs();
            }
            else if(b=='c'||a=='C'){
                System.out.println("Enter the model number");
                type=o.next();
                CVT cv=new CVT(type);
                cv.Showspecs();
            }
            else if(b=='d'||a=='D'){
                System.out.println("Enter the model number");
                type=o.next();
                DCT dc=new DCT(type);
                dc.Showspecs();
            }
            else{
                System.out.println("You have entered an incorrect model number");
            }
        }
        else{
            System.out.println("You have entered an incorrect model number");
        }

    }
}
