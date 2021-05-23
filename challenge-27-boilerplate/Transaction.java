import java.util.Scanner;

public class Transaction {
    private int number,i=0,j=0;
    private double amount,accountbalance;
    private char a;
    private String[] transct=new String[100];
    public void banktranscations(){
        do{
        System.out.println("Enter 1.)to Check balance\n2.)to withdraw money\n3.)to deposit money\n4.)For latest transaction\n5.)For Bank Statement");
        Scanner o=new Scanner(System.in);
        number=o.nextInt();
    switch (number){
    case 1:
    {
        System.out.println("The account balance is "+accountbalance); 
        break;
    }
    case 2:
    {
        System.out.println("Enter the amount to withdraw");
        amount=o.nextDouble();
        if(amount<accountbalance)
        {
        accountbalance-=amount;
        System.out.println("The Updated account balance is "+accountbalance);
        transct[i]="-"+amount+" Withdraw";
        i++;
        }
        else
        {
            System.out.println("WithdrawAmount is higher than account balance");
        }
        break;
    }
    case 3:
    {
        System.out.println("Enter the amount to deposit");
        amount=o.nextDouble();
        accountbalance+=amount;
        System.out.println("The Updated account balance is "+accountbalance);
        transct[i]="+"+amount+" Deposit";
        i++;
        break;
    }
    case 4:{
        System.out.println(transct[i-1]);
        break;
    }
    case 5:{
        for(j=0;j<i;j++){
            System.out.println(transct[j]);
        }
        break;
    }
    default:
    {
        System.out.println("Incorrect option");
    }
    }
    System.out.println("If you want to continue enter 'c' or press 'E' to exit");
     a=o.next().charAt(0);
    }while(a=='c'||a=='C');
    }
    public double  moneytransfer()
    {
        System.out.println("Enter the amount to transfer");
        Scanner o=new Scanner(System.in);
        amount=o.nextDouble();
        if(amount<accountbalance){
            accountbalance-=amount;
            transct[i]="-"+amount+" Fund transfer";
            i++;
            return amount;
        }
        else{
            System.out.println("TransferAmount is higher than account balance");

        }
        return 0;

    }
    public void addmoney(double amount,long acc){
        accountbalance+=amount;
        System.out.println("The Updated account balance is "+accountbalance+" for account number "+acc);
        transct[i]="+"+amount+" Fund received";
        i++;
    }
    
}
