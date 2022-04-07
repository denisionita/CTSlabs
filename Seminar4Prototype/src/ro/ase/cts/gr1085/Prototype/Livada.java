package ro.ase.cts.gr1085.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Livada {
    List<Copac> copaci;

    public Livada(){
        copaci= new ArrayList<>();
    }

    public void planteazaCopac(Copac copac){
        copaci.add(copac);
    }
}
