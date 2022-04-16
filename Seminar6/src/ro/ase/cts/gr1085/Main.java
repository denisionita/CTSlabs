package ro.ase.cts.gr1085;

import ro.ase.cts.gr1085.Facade.DealerAuto;
import ro.ase.cts.gr1085.Proxy.Internet;
import ro.ase.cts.gr1085.Proxy.ProxyInternet;

public class Main {

    public static void main(String[] args) {
/*        DealerAuto da=new DealerAuto();

        da.getDetailsMC();
        da.getDetailsME();
        da.getDetailsMH();*/

        Internet conn=new ProxyInternet();
        conn = (ProxyInternet)conn;
        conn.connectTo("abc.com");
        conn.connectTo("abc2.com");

        metoda(conn,"acascas.com");
    }
    public static void metoda(Internet i, String url)
    {
        i.connectTo(url);
    }
}
