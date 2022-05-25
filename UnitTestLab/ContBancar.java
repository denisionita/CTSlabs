package ro.ase.cts.unitestslab;

public class ContBancar {
    private String numarCont;
    private String nume;
    private int suma;
    private String status = "UNLOCKED";

    public ContBancar(String numarCont, String nume, int suma) {
        this.numarCont = numarCont;
        this.nume = nume;
        this.suma = suma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "numarCont='" + numarCont + '\'' +
                ", nume='" + nume + '\'' +
                ", suma=" + suma +
                '}';
    }
}
