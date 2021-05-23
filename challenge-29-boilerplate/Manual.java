public class Manual extends transmission {
    private double Gear_Ratio_5, Gear_Ratio_6;
    String Model;
    public double getGear_Ratio_5() {
        return Gear_Ratio_5;
    }

    public double getGear_Ratio_6() {
        return Gear_Ratio_6;
    }

    public void setGear_Ratio_6(double gear_Ratio_6) {
        this.Gear_Ratio_6 = gear_Ratio_6;
    }

    public void setGear_Ratio_5(double gear_Ratio_5) {
        this.Gear_Ratio_5 = gear_Ratio_5;
    }
    public Manual(String Model){
        this.Model=Model;
        if(Model.equals("MP4"))
        {
            setForward_Gears(4);
            setGear_Ratio_1(2.540);
            setGear_Ratio_2(1.920);
            setGear_Ratio_3(1.510);
            setGear_Ratio_4(1.000);
        }
        else if(Model.equals("MP5")){
            setForward_Gears(5);
            setGear_Ratio_1(3.545);
            setGear_Ratio_2(1.904);
            setGear_Ratio_3(1.280);
            setGear_Ratio_4(0.914);
            setGear_Ratio_5(0.757);
        }
        else if(Model.equals("MP6")){
            setForward_Gears(6);
            setGear_Ratio_1(3.010);
            setGear_Ratio_2(2.070);
            setGear_Ratio_3(1.430);
            setGear_Ratio_4(1.000);
            setGear_Ratio_5(0.710);
            setGear_Ratio_6(0.570);
        }
        else if(Model.equals("MD5")){
            setForward_Gears(5);
            setGear_Ratio_1(3.545);
            setGear_Ratio_2(1.904);
            setGear_Ratio_3(1.233);
            setGear_Ratio_4(0.911);
            setGear_Ratio_5(0.725);
        }
        else if(Model.equals("MD6")){
            setForward_Gears(6);
            setGear_Ratio_1(3.640);
            setGear_Ratio_2(2.150);
            setGear_Ratio_3(1.360);
            setGear_Ratio_4(1.000);
            setGear_Ratio_5(0.750);
            setGear_Ratio_6(0.630);
        }
        else{
            System.out.println("You have entered an incorrect model number");
        }
    }
    void Showspecs(){
        System.out.println("Transmission Type           : Manual");
        System.out.println("Model Number                : "+Model);
        System.out.println("--------------------Key Specifications---------------------");
        System.out.println("Forward Gears               : "+getForward_Gears());
        System.out.println("1st Gear Ratio              : "+getGear_Ratio_1());
        System.out.println("2st Gear Ratio              : "+getGear_Ratio_2());
        System.out.println("3st Gear Ratio              : "+getGear_Ratio_3());
        System.out.println("4st Gear Ratio              : "+getGear_Ratio_4());
        System.out.println("5st Gear Ratio              : "+getGear_Ratio_5());
        System.out.println("6st Gear Ratio              : "+getGear_Ratio_6());
    } 
}
