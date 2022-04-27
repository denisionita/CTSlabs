package ro.ase.cts.gr1085;

import java.util.HashMap;
import java.util.Map;

public class CustomCarFactory {
    private static final Map carMap = new HashMap<>();

    public static CustomCar getCar(String culoare){
        CustomCar c = (CustomCar) carMap.get(culoare);
        if(c!=null){
            return c;
        }
        else{
            c = new CustomCar(culoare);
            carMap.put(culoare,c);
        }
        return c;
    }
}
