package ro.ase.cts.gr1085.Builder;

public class CamionBuilder implements Builder{
    private String sasiu;
    private String producator;
    private int nrRoti;
    private String motor;
    private String interior;

    @Override
    public Builder addSasiu() {
        this.sasiu="DDD111";
        return this;
    }

    @Override
    public Builder addProducator() {
        this.producator="Ford";
        return this;
    }

    @Override
    public Builder addRoti() {
        this.nrRoti=8;
        return this;
    }

    @Override
    public Builder addMotor() {
        this.motor="Diesel";
        return this;
    }

    @Override
    public Builder addInterior() {
        this.interior="Piele rosie";
        return this;
    }

    @Override
    public Automobil getAutomobil() {
        return new Automobil(sasiu,producator,nrRoti,motor,interior);
    }
}
