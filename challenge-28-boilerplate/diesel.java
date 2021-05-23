public class diesel extends internal{
    public diesel(String Model){
        super(Model);
            if(Model.equals("D1300")){
                setdisplacement(1248);
                setMax_Power(67);
                setMax_RPM(6000);
                setMax_Torque(200);
                setWeight(111);
                setCylinders(4);
                setPowesource("Diesel");
                setCompressionratio("17.6:1");
            }
            else if(Model.equals("D1800")){
                setdisplacement(1796);
                setMax_Power(103);
                setMax_RPM(6300);
                setMax_Torque(170);
                setWeight(141);
                setCylinders(4);
                setPowesource("Diesel");
                setCompressionratio("10.5:1");
            }
            else if(Model.equals("D2400")){
                setdisplacement(2384);
                setMax_Power(136);
                setMax_RPM(7000);
                setMax_Torque(233);
                setWeight(152);
                setCylinders(4);
                setPowesource("Diesel");
                setCompressionratio("11.2:1");
            }
            else{
                System.out.println("You have entered an incorrect Model number");
            }
        }
    
}