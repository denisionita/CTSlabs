package ro.ase.cts.gr1085.Facade;

public class MasinaHybrid extends Masina{
    private Boolean plugin;

    public MasinaHybrid(String producator, String sasiu, String culoare, Boolean plugin) {
        super(producator, sasiu, culoare);
        this.plugin = plugin;
    }

    @Override
    public void getDetails() {
        System.out.println("Producator "+producator+ " sasiu " +sasiu +" culoare "+ culoare+ " plugin " +plugin);
    }
}
