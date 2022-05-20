package ro.ase.cts.gr1085.Seminar10.Command;

public class TransferBancar extends iOperatiuneBancara {

    private float suma;
    private String contDestinatie;

    public TransferBancar(String cont, float suma, String contDestinatie) {
        super(cont);
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Contul "+ cont +" a transferat suma de "+suma+" RON catre contul "+contDestinatie);
    }
}
