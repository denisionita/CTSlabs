package ro.ase.cts.gr1085.Facade;

public class DealerAuto {
    MasinaClasica mc;
    MasinaElectrica me;
    MasinaHybrid mh;

    public DealerAuto() {
    }

    public void getDetailsMC(){
        mc.getDetails();
    }

    public void getDetailsME(){
        me.getDetails();
    }

    public void getDetailsMH(){
        mh.getDetails();
    }
}
