enum accountsstatus{
    Active,Dormant
}
enum accounttype{
    Minor,Public,Senior
}
public class savingsaccount {
    private double intrestRate=0;
    static int i=0;
    private static long id;
    private long accountnumber=id;
    char a;
    customer1 cu=new customer1();
    public savingsaccount(){
        
        if(cu.getage()<18)
        {
            intrestRate=5.00;
        }
        else if(cu.getage()>18&&cu.getage()<45)
        {
            intrestRate=6.5;
        }
        else
        {
            intrestRate=7.00;
        }
        accountnumber+=i;
        i++;
    }
    public void accounttype(){
        if(cu.getage()<18)
        {
            System.out.println(accounttype.Public);
        }
        else if(cu.getage()>18&&cu.getage()<45)
        {
            System.out.println(accounttype.Minor);
        }
        else
        {
            System.out.println(accounttype.Senior);
        }
    }
    public static void setaccountnumber(long account){
        id=account;
    }
    public long getaccountnumber(){
        return accountnumber;
    }
    public void accountStatus(int days){
        if(days<365){
            System.out.println("Your account Status is : "+accountsstatus.Active);
        }
        else{
            System.out.println("Your account Status is : "+accountsstatus.Dormant);
        }
    }
}
    
    
