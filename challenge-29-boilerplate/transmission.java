/**
 * transmission
 */
abstract public class transmission {
    private String Model;
    private int Forward_Gears;
    private double Gear_Ratio_1, Gear_Ratio_2, Gear_Ratio_3, Gear_Ratio_4;
    public String getModel() {
        return Model;
    }

    public double getGear_Ratio_4() {
        return Gear_Ratio_4;
    }

    public void setGear_Ratio_4(double gear_Ratio_4) {
        this.Gear_Ratio_4 = gear_Ratio_4;
    }

    public double getGear_Ratio_3() {
        return Gear_Ratio_3;
    }

    public void setGear_Ratio_3(double gear_Ratio_3) {
        this.Gear_Ratio_3 = gear_Ratio_3;
    }

    public double getGear_Ratio_2() {
        return Gear_Ratio_2;
    }

    public void setGear_Ratio_2(double gear_Ratio_2) {
        this.Gear_Ratio_2 = gear_Ratio_2;
    }

    public double getGear_Ratio_1() {
        return Gear_Ratio_1;
    }

    public void setGear_Ratio_1(double gear_Ratio_1) {
        this.Gear_Ratio_1 = gear_Ratio_1;
    }

    public int getForward_Gears() {
        return Forward_Gears;
    }

    public void setForward_Gears(int forward_Gears) {
        this.Forward_Gears = forward_Gears;
    }

    public void setModel(String model) {
        this.Model = model;
    }
    abstract void Showspecs();
    
}