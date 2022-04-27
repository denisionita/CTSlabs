package ro.ase.cts.gr1085;

public class CustomCar {
    int nrRoti;
    String numeModel;
    String interior;
    String culoare;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }


    public CustomCar(String culoare) {
        this.culoare = culoare;
    }

    public void showColor(){
        System.out.println("Masina are culoarea " + this.culoare);
    }
}
