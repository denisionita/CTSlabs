package ro.ase.cts.gr1085.Seminar10.Command;

import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuniBancare {
    private static ServerOperatiuniBancare s = null;
    private List<iOperatiuneBancara> listaOperatiuni;

    private ServerOperatiuniBancare(){
        this.listaOperatiuni = new ArrayList<>();
    }

    public static synchronized ServerOperatiuniBancare getInstance(){
        if(s==null){
            s = new ServerOperatiuniBancare();
        }
        return s;
    }

    public void inregistreazaOperatiune(iOperatiuneBancara operatiuneBancara){
        this.listaOperatiuni.add(operatiuneBancara);
    }
    public void prelucrareOperatiuni(){
        if(listaOperatiuni.size()>0){
            for(iOperatiuneBancara o : listaOperatiuni){
                o.efectuareOperatiune();
            }
            listaOperatiuni.clear();
        } else {
            System.out.println("Nu exista operatiuni");
        }
    }
}
