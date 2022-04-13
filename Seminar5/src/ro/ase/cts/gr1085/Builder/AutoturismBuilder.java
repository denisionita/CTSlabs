package ro.ase.cts.gr1085.Builder;

public class AutoturismBuilder implements Builder{
    private String sasiu;
    private String producator;
    private String interior;
    private int nrRoti;
    private String motor;

    @Override
    public Builder addSasiu() {
        this.sasiu="ABC123";
        return this;
    }

    @Override
    public Builder addProducator() {
        this.producator="Dacia";
        return this;
    }

    @Override
    public Builder addRoti() {
        this.nrRoti=4;
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
