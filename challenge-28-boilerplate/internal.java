public class internal extends engine{
    private String Model,EngineType="Internal Combustion",Powersource;
    public internal(String model)
    {
        this.Model=model;
    }
    private int Displacement=0,Cylinders=0;
    String Compressionratio;
    public void setPowesource(String Powersource)
    {
        this.Powersource=Powersource;
    }
    public void setdisplacement(int Displacement){
        this.Displacement=Displacement;
    }
    public void setCylinders(int Cylinders){
        this.Cylinders=Cylinders;
    }
    public void setCompressionratio(String compressionratio) {
        Compressionratio = compressionratio;
    }

    @Override
    void showSpecs() {
        System.out.println("Engine Type         :         "+EngineType);
        System.out.println("Engine Power Source :         "+Powersource);
        System.out.println("Model Number        :         "+Model);
        
        System.out.println("-----------KEY SPECIFICATIONS:--------------------");
        System.out.println("1.Displacement         : "+Displacement+"cc");
        System.out.println("2.Max Power            : "+getMax_Power()+"KW");
        System.out.println("3.Max RPM              : "+getMax_RPM());
        System.out.println("4.Max Torque           : "+getMax_Torque()+"Nm");
        System.out.println("6.Number of Cylinders  : "+Cylinders);
        System.out.println("5.Weight               : "+getWeight()+"Kgs");
        System.out.println("8.Compression Ration   : "+Compressionratio);

        

    }
    
}
 

