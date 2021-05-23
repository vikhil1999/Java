import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        String[] routes;
        String a,b;
        task3 t=new task3();
        routes=new String[15];
        int i;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the routes");
        for(i=0;i<15;i++)
        {
            routes[i]=o.next();
        }
        System.out.println("Enter the city from where you want to fly");
        a=o.next();
        System.out.println("Enter the city destination city");
        b=o.next();
        t.showAllConnections(routes,a,b);
        
    }
    String showAllConnections(String[] routeInfo, String fromCity, String toCity)
    {
        System.out.println("Sno.\tFrom\tTo\tDistance in Kms\tTravel Time\tTypical Airfare");
        int i,j,k,h=0;
        for(i=0;i<15;i++)
        {  
            String[] conv=(routeInfo[i].split(","));
            if((conv[0].equals(fromCity))&&(conv[1].equals(toCity)))
            {   h++;
                System.out.print(h+"\t");
                for(k=0;k<5;k++)
                {
                    System.out.print(conv[k]+"\t");
                if(k>=1)
                {
                    System.out.print("\t");
                }
                }
                     System.out.println();
            }
        }
        for(i=0;i<15;i++)
        {
            String[] conv=(routeInfo[i].split(","));
            if(conv[0].equals(fromCity))
            {
            for(j=0;j<15;j++)
            {
                if(i!=j)
                {
                String[] conv1=(routeInfo[j].split(","));
                if((conv[1].equals(conv1[0]))&&(conv1[1].equals(toCity)))
                {   h++;
                    System.out.print(h+"\t");
                    for(k=0;k<5;k++)
                    {
                    System.out.print(conv[k]+"\t");
                    if(k>=1)
                    {
                    System.out.print("\t");
                    }
                    }
                     System.out.println();
                     System.out.print("\t ");
                    for(k=0;k<5;k++)
                    {
                    System.out.print(conv1[k]+"\t");
                    if(k>=1)
                    {
                    System.out.print("\t");
                    }
                    }
                    System.out.println("\t");
                }
                }
            }
            }
            
        }
        if(h==0)
        {
            System.out.println("We are sorry. At this point in time we do not have any information on flights in the specified route");
        }
        return fromCity;
    }
}
