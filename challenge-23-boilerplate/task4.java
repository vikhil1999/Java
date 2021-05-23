import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        String[] routes;
        String a,b;
        task4 t=new task4();
        routes=new String[15];
        int i;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the routes");
        for(i=0;i<3;i++)
        {
            routes[i]=o.nextLine();
        }
        System.out.println("Enter the city from where you want to fly");
        a=o.next();
        System.out.println("Enter the city destination city");
        b=o.next();
        t.showAllConnections(routes,a,b);
        
    }
    String showAllConnections(String[] routeInfo, String fromCity, String toCity)
    {
        System.out.println("Sno.\tFrom\tTo\tDistance in Kms\t   Travel Time\t   Typical Airfare");
        int i,j,k,h=0;
        double currency=0;
        for(i=0;i<3;i++)
        {  
            String[] conv=(routeInfo[i].split(", "));
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
        for(i=0;i<3;i++)
        {
            String[] conv=(routeInfo[i].split(", "));
            if(conv[0].equals(fromCity))
            {
            for(j=0;j<3;j++)
            {
                if(i!=j)
                {
                String[] conv1=(routeInfo[j].split(", "));
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
                    for(int p=0;p<2;p++)
                    {   String a;
                        char[] b;
                        char c;                        
                        if(p==0)
                        {
                            a=conv[4];
                            b=new char[a.length()];
                            b=a.toCharArray();
                        }
                        else{
                            a=conv1[4];
                            b=new char[a.length()];
                            b=a.toCharArray();
                        }
                        c=b[0];
                        int temp=0,q=0;
                        switch(c)
                        {
                            case 'E':
                                    for(q=3;q<b.length;q++)
                                    {
                                    temp=(temp*10)+Integer.parseInt(String.valueOf(b[q]));;
                                    }
                                    currency+=temp*89.7;
                                    break;
                            case 'U':   
                                    for(q=3;q<b.length;q++)
                                    {
                                    temp=(temp*10)+Integer.parseInt(String.valueOf(b[q]));;
                                    }
                                    currency+=temp*73.5;
                                    break;
                            case 'G':
                                    for(q=3;q<b.length;q++)
                                    {
                                    temp=(temp*10)+Integer.parseInt(String.valueOf(b[q]));;
                                    }
                                    currency+=temp*99.31;
                                    break;
                            default:
                                    for(q=3;q<b.length;q++)
                                    {
                                    temp=(temp*10)+Integer.parseInt(String.valueOf(b[q]));;
                                    }
                                    currency+=temp;
                                    break;                                    
                        }

                    } 
                    String[] conv2=conv[3].split(":");
                    String[] conv3=conv1[3].split(":");
                    int hh=0,mm=0;
                    mm=Integer.parseInt(String.valueOf(conv2[1]))+Integer.parseInt(String.valueOf(conv3[1]));
                    if(mm>=60)
                    {
                        hh++;
                        mm=mm%60;
                    }
                    hh+=Integer.parseInt(String.valueOf(conv2[0]))+Integer.parseInt(String.valueOf(conv3[0]));
                    if(hh>12)
                    {
                        hh%=12;
                    }
                    int kms=Integer.parseInt(String.valueOf(conv[2]))+Integer.parseInt(String.valueOf(conv1[2]));

                        System.out.format("\t\t Total\t\t%d\t\t%d:%d\t\tINR%.2f",kms,hh,mm,currency);
                        System.out.println();  
                    
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
