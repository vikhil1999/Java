public class DCT extends Automatic {
    String Model;
    public DCT(String Model){
        super(Model);
        this.Model=Model;
        if(Model.equals("DCT8")){
            setForward_Gears(8);
            setGear_Ratio_1(4.714);
            setGear_Ratio_2(3.143);
            setGear_Ratio_3(2.106);
            setGear_Ratio_4(1.667);
            setGear_Ratio_5(1.285);
            setGear_Ratio_6(1.000);
            setGear_Ratio_7(0.839);
            setGear_Ratio_8(0.667);
            setTransmission_Type("Dual-clutch automatic ");
            
        }
        else{
            System.out.println("You have entered an incorrect model number");
        }
    
    }
}
