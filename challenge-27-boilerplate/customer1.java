class customer1 {
    private String Firstname, Lastname, Address, Village;
    private int Age, CustomerID;
    static int id = 1000;
    private long Aadharnumber, Phonenumber;
    public customer1(){}
    public customer1(String Firstname, String lastname, String Address, int age, long aadharnum, long phonenumber, String Village) {
        this.Firstname = Firstname;
        this.Lastname = lastname;
        this.Address = Address;
        this.Age = age;
        this.Aadharnumber = aadharnum;
        this.Phonenumber = phonenumber;
        this.CustomerID = id;
        this.setVillage(Village);
        id++;
    }
    public int getage(){
        return Age;
    }
    public long getaadhar(){
        return Aadharnumber;
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
