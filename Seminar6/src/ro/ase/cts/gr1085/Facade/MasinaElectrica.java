package ro.ase.cts.gr1085.Facade;

public class MasinaElectrica extends Masina{
    private int autonomieBaterie;

    public MasinaElectrica(String producator, String sasiu, String culoare, int autonomieBaterie) {
        super(producator, sasiu, culoare);
        this.autonomieBaterie = autonomieBaterie;
    }

    public void getDetails(){
        System.out.println("Producator "+producator+ " sasiu " +sasiu +" culoare "+ culoare+ " autonomie baterie " +autonomieBaterie);
    }
}
