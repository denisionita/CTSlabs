package ro.ase.cts.gr1085.Seminar10.Command;

public abstract class iOperatiuneBancara {
    protected String cont;

    public iOperatiuneBancara(String cont) {
        this.cont = cont;
    }

    public abstract void efectuareOperatiune();

}
