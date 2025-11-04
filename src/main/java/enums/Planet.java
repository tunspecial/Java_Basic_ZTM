package enums;


public enum Planet {
    MERCURY("Mercury" , 0.39),
    VENUS("Venus" , 0.72),
    EARTH("Earth" , 1.0),
    MARS("Mars" , 1.52),
    JUPITER("Jupiter" , 5.20),
    SATURN("Saturn" , 9.53),
    URANUS("Uranus" , 19.19),
    NEPTUNE("Neptune" , 30.07);

    private final String name;
    private final double distanceForSun;

    Planet (String name , double distanceForSun){
        this.name = name;
        this.distanceForSun = distanceForSun;
    }

    public String getName() {
        return name;
    }

    public double getDistanceForSun() {
        return distanceForSun;
    }
    
    
}
