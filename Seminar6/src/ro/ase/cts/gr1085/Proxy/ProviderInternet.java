package ro.ase.cts.gr1085.Proxy;

public class ProviderInternet implements Internet{
    @Override
    public void connectTo(String url) {
        System.out.println("Conexiune OK " + url);
    }
}
