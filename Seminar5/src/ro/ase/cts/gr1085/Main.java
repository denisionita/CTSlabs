package ro.ase.cts.gr1085;

import ro.ase.cts.gr1085.Adapter.MasinaJucarie;
import ro.ase.cts.gr1085.Adapter.MasinaPersonala;
import ro.ase.cts.gr1085.Builder.Automobil;
import ro.ase.cts.gr1085.Builder.InginerAuto;

public class Main {

    public static void main(String[] args) throws Exception {
        //Builder
        InginerAuto a1=new InginerAuto("Camion");
        a1.buildAutomobil();
        Automobil camion=a1.getAutomobil();
        System.out.println(camion);

        InginerAuto a2=new InginerAuto("Autoturism");
        a2.buildAutomobil();
        Automobil autoturism=a2.getAutomobil();
        System.out.println(autoturism);
        System.out.println("\n");

        //Adapter
        System.out.println("##### Adapter #####" + "\n");
        MasinaPersonala masinaPersonala=new MasinaPersonala();
        System.out.println("Masina personala: ");
        masinaPersonala.claxoneaza();
        masinaPersonala.ruleaza();
        System.out.println("\n");

        MasinaJucarie  masinaJucarie = new MasinaJucarie();
        System.out.println("Masina jucarie: ");
        masinaJucarie.emiteSunete();
        masinaJucarie.seDeplaseaza();
    }
}
