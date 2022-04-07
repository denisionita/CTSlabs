package ro.ase.cts.gr1085.Prototype;

public class Copac implements Cloneable{

    float inaltime;
    String culoareFrunze;
    String tipCoroana;
    PozitieXOY locPlantare;

    public Copac(float inaltime, String culoareFrunze, String tipCoroana, PozitieXOY locPlantare) {
        this.inaltime = inaltime;
        this.culoareFrunze = culoareFrunze;
        this.tipCoroana = tipCoroana;
        this.locPlantare = locPlantare;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Copac clone = (Copac) super.clone();
        clone.inaltime=inaltime;
        clone.culoareFrunze=culoareFrunze;
        clone.tipCoroana=tipCoroana;
        clone.locPlantare=(PozitieXOY) locPlantare.clone();
        return clone;
    }

    @Override
    public boolean equals(Object c) {
        return true;
    }

    public float getInaltime() {
        return inaltime;
    }

    public String getCuloareFrunze() {
        return culoareFrunze;
    }

    public String getTipCoroana() {
        return tipCoroana;
    }

    public PozitieXOY getLocPlantare() {
        return locPlantare;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    public void setCuloareFrunze(String culoareFrunze) {
        this.culoareFrunze = culoareFrunze;
    }

    public void setTipCoroana(String tipCoroana) {
        this.tipCoroana = tipCoroana;
    }

    public void setLocPlantare(PozitieXOY locPlantare) {
        this.locPlantare = locPlantare;
    }
}
