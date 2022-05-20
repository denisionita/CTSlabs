package ro.ase.cts.gr1085.Seminar10.Command;

import java.util.ArrayList;
import java.util.List;

public class ContBancar {
    private List<iOperatiuneBancara> listaOperatiuneBanc=new ArrayList<>();

    public void inserareOperatiune(iOperatiuneBancara operatiune){
        listaOperatiuneBanc.add(operatiune);
    }

    public void stergereOperatiune(iOperatiuneBancara operatiuneDeSters){
        listaOperatiuneBanc.remove((operatiuneDeSters));
    }

    public void trimitereOperatiune(){
        for(iOperatiuneBancara op:listaOperatiuneBanc)
        {
            op.efectuareOperatiune();
            stergereOperatiune(op);
        }
    }
}
