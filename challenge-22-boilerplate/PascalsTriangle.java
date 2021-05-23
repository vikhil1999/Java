import java.util.Scanner;
public class PascalsTriangle {

    public static void main(String[] args) {
        int no_of_row,c=1;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_of_row = in.nextInt();
        for(int i=1;i<=no_of_row;i++)
        {
            c=1;
        for(int b=1;b<=no_of_row-i;b++)
        System.out.print(" ");
        
        for(int j=1;j<=i;j++)
        {        
        System.out.print(" "+c);
        c=c*(i-j)/j;
        }
        System.out.print("\n");
        }
    }
}