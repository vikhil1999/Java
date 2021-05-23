import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        char type,a;
        String Model;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter I for Internal Combusion and E for Electric");
        type=o.next().charAt(0);
        if(type=='I'||type=='i'){
            System.out.println("Enter P for Petrol,D for Diesel,C for CNG");
            a=o.next().charAt(0);
            if(a=='P'||a=='p'){
                System.out.println("Enter the Model number");
                Model=o.next();
                petrol p=new petrol(Model);
                p.showSpecs();
            }
            else if(a=='D'||a=='d'){
                System.out.println("Enter the Model number");
                Model=o.next();
                diesel d=new diesel(Model);
                d.showSpecs();
            }
            else if(a=='C'||a=='c'){
                System.out.println("Enter the Model number");
                Model=o.next();
                CNG c=new CNG(Model);
                c.showSpecs();
            }
        }
        else if(type=='E'||type=='e'){
            System.out.println("Enter the Model number");
                Model=o.next();
                Electric e=new Electric(Model);
                e.showSpecs();
            
        }
    }
}
