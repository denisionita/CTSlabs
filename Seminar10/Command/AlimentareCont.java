package ro.ase.cts.gr1085.Seminar10.Command;

public class AlimentareCont extends iOperatiuneBancara {
    private float suma;

    public AlimentareCont(String cont,float suma) {
        super(cont);
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Contul "+ cont + " a fost alimentat cu: "+ suma +" RON.");
    }
}
