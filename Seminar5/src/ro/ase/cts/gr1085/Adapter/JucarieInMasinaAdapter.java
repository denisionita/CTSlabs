package ro.ase.cts.gr1085.Adapter;

public class JucarieInMasinaAdapter implements JucarieMobila{
    Masina masina;

    public JucarieInMasinaAdapter(Masina masina) {
        this.masina = masina;
    }

    @Override
    public void seDeplaseaza() {
        this.masina.ruleaza();
    }

    @Override
    public void emiteSunete() {
        this.masina.claxoneaza();
    }
}
