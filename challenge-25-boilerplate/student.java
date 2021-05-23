class student{
    private int roll;
    private static int k;
    private static float b=0,avgmath=0,avgsocial=0,avgenglish=0,avglan=0,avgscience=0;
    private float avg,math,social,english,lan,science,total;
    private String name;
    char avggrade;
    Character grade;
    public student(String name,int roll,float math,float social,float english,float lan,float science)
    {
        this.name=name;
        this.roll=roll;
        this.math=math;
        this.social=social;
        this.english=english;
        this.lan=lan;
        this.science=science;
        total=math+social+english+lan+science;
        avg=total/5;
        avgmath+=math;
        avgsocial+=social;
        avgenglish+=english;
        avglan+=lan;
        avgscience+=science;
    }
    public String getname(){
        return name;
    }
    public int getrollnumber(){
        return roll;
    }
    public float gettotal(){
        return total;
    }
    public float getaverage(){
        return avg;
    }
    public float getaveragemath(int number)
    {
        return avgmath/number;
    }
    public float getaveragesocial(int number)
    {
        return avgsocial/number;
    }
    public float getaverageenglish(int number)
    {
        return avgenglish/number;
    }
    public float getaveragelanguage(int number)
    {
        return avglan/number;
    }
    public float getaveragescience(int number)
    {
        return avgscience/number;
    }
    public int numbercleared()
    {
        if(math>=35)
            {
                if(social>=35)
                {
                    if(english>=35)
                    {
                        if(lan>=35)
                        {
                            if(science>35)
                            {
                                k++;                                
                            }
                        }
                    }
                }
            }
        if(math>=35)
        {
            if(social>=35)
                {
                if(english>=35)
                {
                    if(lan>=35)
                    {
                        if(science>35)
                        {
                            System.out.println("Name of the student "+name+",Rollno "+roll);                                
                        }
                    }
                }
            }
        }
        return k;
    }
    public void numbernotcleared()
        {
            if(math<35)
            {
                System.out.println("Name of the student "+name+",Rollno "+roll); 
            }
            else if(social<35)
            {
                System.out.println("Name of the student "+name+",Rollno "+roll);   
            }
            else if(english<35)
            {
                System.out.println("Name of the student "+name+",Rollno "+roll);    
            }
            else if(lan<35)
            {
                System.out.println("Name of the student "+name+",Rollno "+roll);    
            }
            else if(science<35)
            {
                System.out.println("Name of the student "+name+",Rollno "+roll);    
            }
        }
        public char gradefinder()
        {
            if(avg>=90)
            {
                System.out.println("The grade obtained by "+name+" is A for total marks of "+total+" and average marks is "+avg);
                avggrade='A';
                return 'A';
            }
            else if(avg>=80&&avg<90)
            {
                System.out.println("The grade obtained by "+name+" is B for total marks of "+total+" and average marks is "+avg);
                avggrade='B';
                return 'B';
            }
            else if(avg>=70&&avg<80)
            {
                System.out.println("The grade obtained by "+name+" is C for total marks of "+total+" and average marks is "+avg);
                avggrade='C';
                return 'C';
            }
            else if(avg>=60&&avg<70)
            {
                System.out.println("The grade obtained by "+name+" is D for total marks of "+total+" and average marks is "+avg);
                avggrade='D';
                return 'D';
            }
            else if(avg>=50&&avg<60)
            {
                System.out.println("The grade obtained by "+name+" is E for total marks of "+total+" and average marks is "+avg);   
                avggrade='E';
                return 'E';
            }
            else
            {
                System.out.println("The grade obtained by "+name+" is F for total marks of "+total+" and average marks is "+avg);
                avggrade='F';
                return 'F';
            }
        }
        public void displaydetails(){
            System.out.println("Name                        : "+name);
            System.out.println("Rollno.                     : "+roll);
            System.out.println("Marks obtained in math      : "+math);
            System.out.println("Marks obtained in social    : "+social);
            System.out.println("Marks obtained in english   : "+english);
            System.out.println("Marks obtained in language  : "+lan);
            System.out.println("Marks obtained in science   : "+science);
            System.out.println("Total marks obtained        : "+total);
            System.out.println("Grade obtained              : "+avggrade);
        }
        
    

}