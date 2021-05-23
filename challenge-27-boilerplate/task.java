
import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        savingsaccount[] s = new savingsaccount[100];
        customer1[] c=new customer1[100]; 
        Transaction[] t=new Transaction[100]; 
        String Firstname, Lastname, Address, Village;
        int Age,i = 0, j,lastTransaction=0,p=0;
        long Aadharnumber, Phonenumber,accountnumber,toaccountnumber;
        System.out.println("Enter the 13 digit starting sequence of account number");
        accountnumber=o.nextLong();
        savingsaccount.setaccountnumber(accountnumber);
        char a;
        do {
            System.out.println("Enter the First name");
            Firstname = o.next();
            System.out.println("Enter the Last name");
            Lastname = o.next();
            System.out.println("Enter the Address");
            Address = o.next();
            System.out.println("Enter the Village name");
            Village = o.next();
            System.out.println("Enter the Age ");
            Age = o.nextInt();
            System.out.println("Enter the Aadharnumber");
            Aadharnumber = o.nextLong();
            for(j=0;j<i;j++){
                if (c[j].getaadhar()==Aadharnumber){
                    System.out.println("You already have an account");
                    p++;

                }
            }if(p==0){
            System.out.println("Enter the Phonenumber");
            Phonenumber = o.nextLong();
            c[i] = new customer1(Firstname, Lastname, Address, Age, Aadharnumber, Phonenumber, Village);
            s[i]=new savingsaccount();
            t[i]=new Transaction();
            if (c[i].checkphonenumber(Phonenumber) && c[i].checkaadhar(Aadharnumber)) {

                i++;

            } else {
                System.out.println("Some of the details which you have entered does not match the requirement,Check the details and enter again");
            }
            }p=0;
            System.out.println("If there are any other customer if Yes enter(y) if No enter(N)");
            a = o.next().charAt(0); 
        } while (a == 'y' || a == 'Y');
        for(j=0;j<i;j++){
            System.out.println("Enter the number of days since last transaction for account number "+s[j].getaccountnumber());
            lastTransaction=o.nextInt();
            s[j].accountStatus(lastTransaction);
        }
        do{
        System.out.println("Enter the account number to make the transaction");
        accountnumber=o.nextLong();
        int h=0;
        if(String.valueOf(accountnumber).length()==13)
        {
            hi:
        for(j=0;j<i;j++){
            
            if(accountnumber==(s[j].getaccountnumber())){
                t[j].banktranscations();
                h++;
                break hi;
            }
        }
        if(h==0)
            {
                System.out.println("The Transaction is Aborted due to incorrect account number");
            }
        }
        else
        {
            System.out.println("The Transaction is Aborted due to incorrect account number");
        }
        System.out.println("Enter the account number to make the fund transfer");
        accountnumber=o.nextLong();
        int kk=0,pp=0;
        if(String.valueOf(accountnumber).length()==13)
        {
            hi:
        for(j=0;j<i;j++){
            if(accountnumber==(s[j].getaccountnumber()))
            { kk++;
                System.out.println("Enter the recipient account number");
                toaccountnumber=o.nextLong();
                for(int k=0;k<i;k++){
                    if(toaccountnumber==(s[k].getaccountnumber()))
                    {
                     double amount=t[j].moneytransfer();
                     t[k].addmoney(amount,toaccountnumber);
                     pp++;
                     break hi;
                    }
                    
                }
                if(pp==0){
                    System.out.println("The Transaction is Aborted due to incorrect account number3");
                }
            }
        }
        if(kk==0){
            System.out.println("The Transaction is Aborted due to incorrect account number2");
        }
        }
        else
        {
            System.out.println("The Transaction is Aborted due to incorrect account number1");
        }
        System.out.println("If u want to continue enter 'c'");
        a=o.next().charAt(0);
        }while(a=='c'||a=='C');
        
    }
}
