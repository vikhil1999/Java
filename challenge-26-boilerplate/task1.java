
/**
 * task1
 */
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        customer1[] c = new customer1[100];
        String Firstname, Lastname, Address, Village;
        int Age;
        long Aadharnumber, Phonenumber;
        int i = 0, j;
        String findlast;
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
            System.out.println("Enter the Phonenumber");
            Phonenumber = o.nextLong();
            c[i] = new customer1(Firstname, Lastname, Address, Age, Aadharnumber, Phonenumber, Village);
            if (c[i].checkphonenumber(Phonenumber) && c[i].checkaadhar(Aadharnumber)) {
                i++;

            } else {
                System.out.println("Some of the details which you have entered does not match the requirement,Check the details and enter again");
            }
            System.out.println("If there are any other customer if Yes enter(y) if No enter(N)");
            a = o.next().charAt(0);
        } while (a == 'y' || a == 'Y');
        System.out.println("Enter the last name of the customer to know his details");
        findlast = o.next();
        for (j = 0; j < i; j++) {
            if (findlast.equals(c[j].getLastname())) {
                c[j].printdetails();
            }
        }
        System.out.println("Enter the name of the village to know the customer details in that village");
        Village=o.next();
        System.out.println("Details of all the customers in "+Village+" village");
        System.out.println("CustomerId\tFirstname\tLastname\tAge\tPhonenumber\tAadharnumber");
        for (j = 0; j < i; j++) {
            if(Village.equals(c[j].getVillage()))
            {
                c[j].basedOnVillage();
            }
        }

    }
}

class customer1 {
    private String Firstname, Lastname, Address, Village;
    private int Age, CustomerID;
    static int id = 1000;
    private long Aadharnumber, Phonenumber;

    public customer1(String Firstname, String lastname, String Address, int age, long aadharnum, long phonenumber,
            String Village) {
        this.Firstname = Firstname;
        this.Lastname = lastname;
        this.Address = Address;
        this.Age = age;
        this.Aadharnumber = aadharnum;
        this.Phonenumber = phonenumber;
        this.CustomerID = id;
        this.Village =Village;
        id++;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        this.Village = village;
    }

    public String getLastname() {
        return Lastname;
    }
    boolean checkphonenumber(Long phonenum)
    {   int i=0;
        while(phonenum!=0)
        {
            phonenum/=10;
            i++;
        }
        if(i==10)
        {
            return true;
        }
        return false;
    }
    boolean checkaadhar(Long aadharnum)
    {
        int i=0;
        while(aadharnum!=0)
        {
            aadharnum/=10;
            i++;
            
        }
        if(i==12)
        {
            return true;
        }
            return false;
    }
    void printdetails(){
        System.out.println("CustomerId   : "+CustomerID);
        System.out.println("Firstname    : "+Firstname);
        System.out.println("Lastname     : "+Lastname);
        System.out.println("Age          : "+Age);
        System.out.println("Phonenumber  : "+Phonenumber);
        System.out.println("Aadharnumber : "+Aadharnumber);
        System.out.println("Address      : "+Address);
    }
    void basedOnVillage(){
        System.out.println(" "+CustomerID+"\t\t "+Firstname+"\t\t"+Lastname+"\t\t"+Age+"\t"+Phonenumber+"\t"+Aadharnumber);
    }
}
