import java.util.Scanner;
class task
{
    public static void main(String[] args) {
        String[] routes;
        String a;
        routes=new String[15];
        //convert=new String[15];
        int i,j;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the routes");
        for(i=0;i<15;i++)
        {
            routes[i]=o.next();
        }
        System.out.println("Sno.\tFrom\tTo\tDistance in Kms\tTravel Time\tTypical Airfare");
        for(i=0;i<15;i++)
        {  
            String[] conv=(routes[i].split(","));
            System.out.print(i+"\t");
            for(j=0;j<5;j++)
            {
                System.out.print(conv[j]+"\t");
                if(j>=1)
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    }
}