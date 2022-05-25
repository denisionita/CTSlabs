package ro.ase.cts.unitestslab;

import java.util.List;

public class AplicatieBancara {
    private List<ContBancar> conturiBancare;
    private static AplicatieBancara instance = null;

    private AplicatieBancara() {
        this.conturiBancare = null;
    }

    public static AplicatieBancara getInstance()
    {
        if(instance == null)
            instance = new AplicatieBancara();
        return instance;
    }

    public void inregistrareCont(String numarCont, String nume, int suma){
        ContBancar c = new ContBancar(numarCont,nume,suma);
        conturiBancare.add(c);
    }

    public void tranzactionare(ContBancar cont1, ContBancar cont2, int suma){
        if(cont1.getStatus() == "UNLOCKED" && cont2.getStatus() == "UNLOCKED" )
        if(cont1.getSuma()>=suma){
            //se poate face tranzactia, contul are fonduri suficiente
            cont1.setSuma(cont1.getSuma()-suma);
            cont2.setSuma(cont2.getSuma()+suma);
            System.out.println("Tranzactie reusita");
        }else{
            System.out.println("Fonduri insuficiente");
        }
    }

    public void stergereCont(ContBancar c){
        c.setNumarCont("");
    }

    public void blocareCont(ContBancar c){
        c.setStatus("LOCKED");
    }
}
