public class AMT extends Automatic{
    String Model;
    private double Gear_Ratio_5, Gear_Ratio_6;
    public AMT(String Model){
        super(Model);
        this.Model=Model;
        if(Model.equals("AMTP4")){
            setForward_Gears(4);
            setGear_Ratio_1(2.540);
            setGear_Ratio_2(1.920);
            setGear_Ratio_3(1.510);
            setGear_Ratio_4(1.000);
            setTransmission_Type("Automated Manual");
        }
        else if(Model.equals("AMTD5")){
            setForward_Gears(5);
            setGear_Ratio_1(2.950);
            setGear_Ratio_2(1.940);
            setGear_Ratio_3(1.340);
            setGear_Ratio_4(1.000);
            setGear_Ratio_5(0.630);
            setTransmission_Type("Automated Manual");
        }
        else{
            System.out.println("You have entered an incorrect model number");
        }
    }
    
}
