package ro.ase.cts.gr1085.Adapter;

public class MasinaPersonala implements Masina{
    @Override
    public void claxoneaza() {
        System.out.println("Viteza actuala: 80km/h");
    }

    @Override
    public void ruleaza() {
        System.out.println("!!!!!");
    }
}
