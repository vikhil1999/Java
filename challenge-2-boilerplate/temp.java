// Write a program that prints out a table to show the temperature in degree celsius and the equivalent temperature in degrees Fahrenheit.
class temp
{
    public static void main(String[]args)
    {
        float celsius=0,Fahrenheit;
        int i,a=100;
        System.out.println("Sr. No      Temperature(celsius)        Temperature(fahrenheit)");
        for(i=0;i<=a;i++)
        {
            Fahrenheit=(float)((celsius*(1.8))+32);
            System.out.println("  "+i +"\t\t  "+ celsius +"\t\t\t\t"+ Fahrenheit);
            celsius+=10;
        }

    }
}