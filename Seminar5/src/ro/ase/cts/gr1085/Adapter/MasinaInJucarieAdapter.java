package ro.ase.cts.gr1085.Adapter;

public class MasinaInJucarieAdapter implements Masina{
    JucarieMobila masina;

    public MasinaInJucarieAdapter(JucarieMobila masina) {
        this.masina = masina;
    }

    @Override
    public void claxoneaza() {
        this.masina.emiteSunete();
    }

    @Override
    public void ruleaza() {
        this.masina.seDeplaseaza();
    }
}
