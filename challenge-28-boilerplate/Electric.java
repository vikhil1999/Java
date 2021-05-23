public class Electric extends engine{
    private String Model,EngineType="Electrical",Powersource="Current",CurrentType="DC";
    private int Voltage=120;
    public Electric(String Model){
        this.Model=Model;
        if(Model.equals("88")){
            setMax_Power(88);
            setMax_RPM(15000);
            setMax_Torque(220);
            setWeight(45);
        }
        else{
            System.out.println("You have entered an incorrect Model number");
        }
    }
    void showSpecs() {
        System.out.println("Engine Type         :         "+EngineType);
        System.out.println("Engine Power Source :         "+Powersource);
        System.out.println("Model Number        :         "+Model);
        
        System.out.println("-----------KEY SPECIFICATIONS:--------------------");

        System.out.println("1.CurrentType          : "+CurrentType);
        System.out.println("2.Max Power            : "+getMax_Power()+"KW");
        System.out.println("3.Max RPM              : "+getMax_RPM());
        System.out.println("4.Max Torque           : "+getMax_Torque()+"Nm");
        System.out.println("5.Voltage              : "+Voltage+"V");
        System.out.println("6.Weight               : "+getWeight()+"kgs");
    }


    
}
