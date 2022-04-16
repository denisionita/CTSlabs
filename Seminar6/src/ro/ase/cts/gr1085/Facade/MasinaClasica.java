package ro.ase.cts.gr1085.Facade;

public class MasinaClasica extends Masina{
    private String aditiv;

    public MasinaClasica(String producator, String sasiu, String culoare, String aditiv) {
        super(producator, sasiu, culoare);
        this.aditiv = aditiv;
    }

    @Override
    public void getDetails() {
        System.out.println("Producator "+producator+ " sasiu " +sasiu +" culoare "+ culoare+ " aditiv "+ aditiv);
    }
}
