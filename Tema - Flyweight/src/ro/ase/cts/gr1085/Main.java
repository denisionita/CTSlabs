package ro.ase.cts.gr1085;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "yellow", "blue", "pink", "yellow", "blue", "blue","black");
        for( int i=0;i<colors.size();i++){
            CustomCar customCar = CustomCarFactory.getCar(colors.get(i));
            customCar.showColor();
        }

    }
}
