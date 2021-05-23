public class CVT extends Automatic {
    String Model;
    public CVT (String Model){
        super(Model);
        this.Model=Model;
        if(Model.equals("CVT6")){
            setForward_Gears(6);
            setGear_Ratio_1(2.631);
            setGear_Ratio_2(1.440);
            setGear_Ratio_3(1.165);
            setGear_Ratio_4(0.906);
            setGear_Ratio_5(0.680);
            setGear_Ratio_6(0.499);
            setTransmission_Type("Continuously variable");
        }
        else{
            System.out.println("You have entered an incorrect model number");
        }
    }
}
