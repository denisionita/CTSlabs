package ro.ase.cts.gr1085.Adapter;

public class MasinaJucarie implements JucarieMobila{

    @Override
    public void seDeplaseaza() {
        System.out.println("Se deplaseaza cu 0.1 km/h");
    }

    @Override
    public void emiteSunete() {
        System.out.println("Tokyo drift song");
    }
}
