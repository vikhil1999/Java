 import java.util.Scanner;
class task1
{
    public static void main(String[] args) {
        String[] routes;
        String a;
        task1 t=new task1();
        routes=new String[15];
        int i,j,k=0;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the routes");
        for(i=0;i<15;i++)
        {
            routes[i]=o.next();
        }
        System.out.println("Enter the city name from where you want to fly");
        a=o.next();
        t.showDirectFlights(routes,a);
        
    }
    String showDirectFlights(String[] routeInfo, String fromCity)
    {
        int i,k=0,j;
        for(i=0;i<15;i++)
        {  
            String[] conv=(routeInfo[i].split(","));
            if(fromCity.equals(conv[0]))
            {
                if(i==0)
                {
                    System.out.println("Sno.\tFrom\tTo\t\tDistance in Kms\t\tTravel Time\tTypical Airfare");
                }
                k++;
            System.out.print(i+"\t");
            for(j=0;j<5;j++)
            {
                System.out.print(conv[j]+"\t");
                if(j==1)
                {
                    System.out.print("\t");
                }
                if(j>=1)
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
            }
        }
        if(k==0)
        {
            System.out.println("We are sorry. At this point in time we do not have any information on flights in the specified route");
        }
        return fromCity;
    }
}
    
