// CHALLENGE-4

import java.util.Scanner;
class temperature   
{
    public static void main(String[]args)
    {
        float celsius=0,Fahrenheit;
        char a;
        Scanner o=new Scanner(System.in);
        do
        {
            System.out.println("Enter the celsius");
            celsius=o.nextFloat();
            Fahrenheit=celsiustofahrenheit(celsius);
            System.out.println("Temperature(celsius)="+celsius+"            Temperature(fahrenheit)="+Fahrenheit);
            System.out.println("Do you want to continue(y/n)");
            a=o.next().charAt(0);
        }while(a=='y'||a=='Y');
    }
public static float celsiustofahrenheit(float c)
{
    float b;
    b=(float)((c*(1.8))+32);
    return b;
}
}