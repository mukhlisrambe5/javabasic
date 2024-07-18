package hasmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String, String> countries = new HashMap<String, String>();

        //add a key and value
        countries.put("USA", "Washington D.C.");
        countries.put("Canada", "Ottawa");
        countries.put("France", "Paris");

        for (String country : countries.keySet()){
            System.out.println("Key: " + country + ", Value: " + countries.get(country));
        }

    }
}
