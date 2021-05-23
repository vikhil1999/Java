// CHALLENGE-5

import java.util.Scanner;
class temperature   
{
    public static void main(String[]args)
    {
        int temp;
        //float celsius,farenheit;
        char a,b;
        temperature t=new temperature();
        Scanner o=new Scanner(System.in);
        do
        {
        System.out.println("Enter the temperature");
        temp=o.nextInt();
        System.out.println("Enter the source scale(celcius(c)/fahrenheit(f))?");
        a=o.next().charAt(0);
        if(a=='c'||a=='C')
        {
            t.celsiusToFahrenheit(temp);
        }
        else
        {
           t.fahrenheitToCelsius(temp);
        }
        System.out.println("Do you wish to continue(y/n)?");
        b=o.next().charAt(0);
        }while(b=='y'||b=='Y');
    }
    public void celsiusToFahrenheit(int temp)
    {
        float celsius,fahrenheit;
        fahrenheit=(float)((temp*(1.8))+32);
        celsius=temp;
        System.out.println("Temperature(celsius)="+celsius+"\t\tTemperature(fahrenheit)="+fahrenheit);
    }
    public void fahrenheitToCelsius(int temp)
    {
        float celsius,fahrenheit;
        celsius=(float)((temp-32)/1.8);
        fahrenheit=temp;
        System.out.println("Temperature(celsius)="+celsius+"\t\tTemperature(fahrenheit)="+fahrenheit);
    }
}

