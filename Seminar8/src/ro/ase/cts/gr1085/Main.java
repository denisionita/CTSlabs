package ro.ase.cts.gr1085;

import ro.ase.cts.gr1085.Composite.Angajat;
import ro.ase.cts.gr1085.Composite.IAngajat;
import ro.ase.cts.gr1085.Observer.CarOS;
import ro.ase.cts.gr1085.Observer.UpdateServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Composite
        Angajat a1 = new Angajat("Andrei Popescu", "100");
        Angajat a2 = new Angajat("Andreea Mihaescu", "101");
        Angajat a3 = new Angajat("abc", "102");
        a1.afiseazaDetalii();
        a2.afiseazaDetalii();
        //List<IAngajat> list = Arrays.asList(new IAngajat[]{a1,a2});

        Angajat m1 = new Angajat("Traian Mircea", "900");
        m1.adaugareSubordonat(a3);
        m1.adaugareSubordonat(a2);
        m1.afiseazaDetalii();

        //Observer
        UpdateServer updateServer = new UpdateServer("iOS13");
        CarOS carOS1 = new CarOS("ios12");
        CarOS carOS2 = new CarOS("ios11");
        updateServer.addObserver(carOS1);
        updateServer.addObserver(carOS2);
        carOS1.afiseaza();
        carOS2.afiseaza();
        updateServer.pushUpdates("iOS13");
        carOS1.afiseaza();
        carOS2.afiseaza();
    }
}
