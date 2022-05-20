package ro.ase.cts.gr1085.Seminar10.Command;

public class Main {
    public static void main(String[] args) {

        ServerOperatiuniBancare server = ServerOperatiuniBancare.getInstance();

        iOperatiuneBancara alimentareCont = new AlimentareCont("BCR123123123",123);
        iOperatiuneBancara transferBancar = new TransferBancar("BRD1231253213",200,"BCR123123123");

        server.inregistreazaOperatiune(alimentareCont);
        server.inregistreazaOperatiune(transferBancar);
        server.prelucrareOperatiuni();
        server.prelucrareOperatiuni();

    }
}
