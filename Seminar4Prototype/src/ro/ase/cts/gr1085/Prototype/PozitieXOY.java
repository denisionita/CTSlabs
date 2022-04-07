package ro.ase.cts.gr1085.Prototype;

public class PozitieXOY implements Cloneable{
    private int x;
    private int y;

    public PozitieXOY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        PozitieXOY clone = (PozitieXOY) super.clone();
        clone.x=x;
        clone.y=y;
        return clone;
    }


}
