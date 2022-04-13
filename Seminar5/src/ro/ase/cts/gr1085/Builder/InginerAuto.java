package ro.ase.cts.gr1085.Builder;

public class InginerAuto {
    Builder builder;

    public InginerAuto(String builderName) throws Exception{
        if(builderName.equalsIgnoreCase("Autoturism")){
            this.builder=new AutoturismBuilder();
        }else if(builderName.equalsIgnoreCase("Camion")){
            this.builder=new CamionBuilder();
        }else{
            throw new Exception();
        }
    }

    public void buildAutomobil(){
        builder.addInterior().addMotor().addRoti().addSasiu().addProducator();
    }

    public Automobil getAutomobil(){
        return builder.getAutomobil();
    }
}
