/**
 * engine
 */
abstract public class engine {
    String Model = "";
    private int Max_Power = 0, Max_RPM = 0, Max_Torque = 0, Weight = 0;

    public int getMax_Power() {
        return Max_Power;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        this.Weight = weight;
    }

    public int getMax_Torque() {
        return Max_Torque;
    }

    public void setMax_Torque(int max_Torque) {
        this.Max_Torque = max_Torque;
    }

    public int getMax_RPM() {
        return Max_RPM;
    }

    public void setMax_RPM(int max_RPM) {
        this.Max_RPM = max_RPM;
    }

    public void setMax_Power(int max_Power) {
        this.Max_Power = max_Power;
    }
    abstract void showSpecs();
}