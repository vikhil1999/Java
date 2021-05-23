// Write a program that prints out a table to show the temperature in degree celsius and the equivalent temperature in degrees Fahrenheit.

class temperature
{
    public static void main(String[]args)
    {
        int celsius=0,Fahrenheit,i,a;
        a=11;
        System.out.println("Sr. No      Temperature(celsius)        Temperature(fahrenheit)");
        for(i=1;i<=a;i++)
        {
            Fahrenheit=(int)((celsius*(1.8))+32);
            System.out.println("  "+i +"\t\t  "+ celsius +"\t\t\t\t"+ Fahrenheit);
            celsius+=10;
        }

    }
}