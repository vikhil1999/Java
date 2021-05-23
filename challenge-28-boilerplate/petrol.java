public class petrol extends internal
{   public petrol(String Model){
    super(Model);
        if(Model.equals("P1000")){
            setdisplacement(996);
            setMax_Power(50);
            setMax_RPM(6000);
            setMax_Torque(90);
            setWeight(75);
            setCylinders(3);
            setPowesource("Petrol");
            setCompressionratio("11.0:1");
        }
        else if(Model.equals("P1500")){
            setdisplacement(1498);
            setMax_Power(88);
            setMax_RPM(6500);
            setMax_Torque(155);
            setWeight(93);
            setCylinders(4);
            setPowesource("Petrol");
            setCompressionratio("10.3:1");
        }
        else if(Model.equals("P2000")){
            setdisplacement(1992);
            setMax_Power(118);
            setMax_RPM(6500);
            setMax_Torque(220);
            setWeight(125);
            setCylinders(4);
            setPowesource("Petrol");
            setCompressionratio("12.0:1");
        }
        else if(Model.equals("P2400")){
            setdisplacement(2396);
            setMax_Power(138);
            setMax_RPM(6900);
            setMax_Torque(340);
            setWeight(140);
            setCylinders(6);
            setPowesource("Petrol");
            setCompressionratio("10.5:1");
        }
        else{
            System.out.println("You have entered an incorrect Model number");
        }
    }
}
