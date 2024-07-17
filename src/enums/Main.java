package enums;

enum Planet {
    MERCURY(1), 
    VENUS(2), 
    EARTH(3), 
    MARS(4), 
    JUPITER(5), 
    SATURN(6), 
    URANUS(7), 
    NEPTUNE(8), 
    PLUTO(9);

    int number;
    
    Planet(int number) {
        this.number = number;
    }

}

public class Main {

    public static void main(String[] args) {
        Planet myPlanet = Planet.MARS;
        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.println("Yes, we can live here.");
                break;
            default:
                System.out.println("No, we cannot live here.");
                break;
        }
    }
}
