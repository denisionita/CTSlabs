package ro.ase.cts.gr1085.Builder;

public class Automobil {
    private String sasiu;
    private String producator;
    private int roti;
    private String motor;
    private String interior;

    public Automobil(String sasiu, String producator, int roti, String motor, String interior) {
        this.sasiu = sasiu;
        this.producator = producator;
        this.roti = roti;
        this.motor = motor;
        this.interior = interior;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setRoti(int roti) {
        this.roti = roti;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "sasiu='" + sasiu + '\'' +
                ", producator='" + producator + '\'' +
                ", roti=" + roti +
                ", motor='" + motor + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
