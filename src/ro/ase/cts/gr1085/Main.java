package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

class LowerCaseException extends Exception {
    public LowerCaseException() {
        System.out.println("litere mici");
    }
}
class UpperCaseException extends Exception {
    public UpperCaseException() {
        System.out.println("litere mari");
    }
}
public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("tastati o propozitie care contine litere mari si mici:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String text = br.readLine();

            //daca toate literele sunt mici (lower case) - LowerCaseException
            //daca toate literele sunt mari (uppercase) - UpperCaseException
            if(text.toLowerCase(Locale.ROOT).equals(text)) throw new LowerCaseException();
            if(text.toUpperCase(Locale.ROOT).equals(text)) throw new UpperCaseException();

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
