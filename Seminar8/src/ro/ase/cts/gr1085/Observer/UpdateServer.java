package ro.ase.cts.gr1085.Observer;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    private String updatePackage;
    private List<CarOS> observers;

    public UpdateServer(String updatePackage) {
        this.updatePackage = updatePackage;
        this.observers = new ArrayList<>();
    }

    public void pushUpdates(String update){
        this.updatePackage=update;
        for(CarOS carOS:observers){
            carOS.update(update);
        }
    }

    public void addObserver(CarOS carOS){
        this.observers.add(carOS);
    }

    public void deleteObserver(CarOS carOS){
        if(this.observers.contains(carOS))
            this.observers.remove(carOS);
    }
}
