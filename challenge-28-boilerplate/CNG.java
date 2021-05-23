public class CNG extends internal{
    public CNG(String Model){
        super(Model);
            if(Model.equals("C1000")){
                setdisplacement(998);
                setMax_Power(43);
                setMax_RPM(6000);
                setMax_Torque(78);
                setWeight(75);
                setCylinders(3);
                setPowesource("CNG");
                setCompressionratio("11.0:1");
            }
            else if(Model.equals("C1500")){
                setdisplacement(1498);
                setMax_Power(69);
                setMax_RPM(6500);
                setMax_Torque(122);
                setWeight(93);
                setCylinders(4);
                setPowesource("CNG");
                setCompressionratio("10.5:1");
            }
            else{
                System.out.println("You have entered an incorrect Model number");
            }
        }
}
