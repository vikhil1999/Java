public class Automatic extends transmission {
    private String Model, Transmission_Type;

    public Automatic(String Model) {
        this.Model = Model;
    }

    public String getTransmission_Type() {
        return Transmission_Type;
    }

    public void setTransmission_Type(String transmission_Type) {
        this.Transmission_Type = transmission_Type;
    }

    private double Gear_Ratio_5, Gear_Ratio_6, Gear_Ratio_7, Gear_Ratio_8;

    public double getGear_Ratio_7() {
        return Gear_Ratio_7;
    }

    public double getGear_Ratio_6() {
        return Gear_Ratio_6;
    }

    public void setGear_Ratio_6(double gear_Ratio_6) {
        this.Gear_Ratio_6 = gear_Ratio_6;
    }

    public double getGear_Ratio_5() {
        return Gear_Ratio_5;
    }

    public void setGear_Ratio_5(double gear_Ratio_5) {
        this.Gear_Ratio_5 = gear_Ratio_5;
    }

    public double getGear_Ratio_8() {
        return Gear_Ratio_8;
    }
    public void setGear_Ratio_8(double gear_Ratio_8) {
        this.Gear_Ratio_8 = gear_Ratio_8;
    }
    public void setGear_Ratio_7(double gear_Ratio_7) {
        this.Gear_Ratio_7 = gear_Ratio_7;
    }
    void Showspecs(){
        System.out.println("Transmission Type           : "+getTransmission_Type());
        System.out.println("Model Number                : "+Model);
        System.out.println("--------------------Key Specifications---------------------");
        System.out.println("Forward Gears               : "+getForward_Gears());
        System.out.println("1st Gear Ratio              : "+getGear_Ratio_1());
        System.out.println("2st Gear Ratio              : "+getGear_Ratio_2());
        System.out.println("3st Gear Ratio              : "+getGear_Ratio_3());
        System.out.println("4st Gear Ratio              : "+getGear_Ratio_4());
        System.out.println("5st Gear Ratio              : "+getGear_Ratio_5());
        System.out.println("6st Gear Ratio              : "+getGear_Ratio_6());
        System.out.println("7st Gear Ratio              : "+getGear_Ratio_7());
        System.out.println("8st Gear Ratio              : "+getGear_Ratio_8());
    }
}
