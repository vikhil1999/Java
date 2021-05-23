/**
 * task
 */
import java.util.Scanner;
public class task {
    public static void main(String[] args) 
    {
        int n,i;
        int[] a;
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the number");
        n=o.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=o.nextInt();
        }
        sort(a);
        
    }
    public static void sort(int[] arr) {

        int temp=0;

        for (int i = 0; i < arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++) 
            {
                if(arr[i]>arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    
}