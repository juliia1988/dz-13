public enum SolarSystem {

    MERCURY(1, 0, 2450, "No previous planet", "VENUS"),

    VENUS(2, 50, 6050, "MERCURY", "EARTH"),
    EARTH(3, 42, 6400, "VENUS", "MARS"),

    MARS(4, 78, 3400, "EARTH", "JUPITER"),

    JUPITER(5, 552, 71500, "MARS", "SATURN"),

    SATURN(6, 620, 60000, "JUPITER", "URANUS"),

    URANUS(7, 1500, 25500, "SATURN", "NEPTUNE"),

    NEPTUNE(8, 1600, 24000, "URANUS", "No next planet");

    private int idNumber;

    SolarSystem(int idNumber, int spaceFromPreviousPlanet, int radius, String previousPlanet, String nextPlanet) {
        this.idNumber = idNumber;
        this.spaceFromPreviousPlanet = spaceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getIdNumber() {
        return idNumber;
    }

    private final int spaceFromPreviousPlanet;

    public int getSpaceFromPreviousPlanet() {
        return spaceFromPreviousPlanet;
    }

    private final int radius;

    public int getRadius() {
        return radius;
    }

    private String previousPlanet;

    public String getPreviousPlanet() {
        return previousPlanet;
    }

    private String nextPlanet;

    public String getNextPlanet() {
        return nextPlanet;
    }

    public int getSpaceFromSun() {
        int spaceFromFirstPlanetToSun = 58;
        int spaceFromSun = 0;

        for (SolarSystem planet: SolarSystem.values()) {

            spaceFromSun += planet.spaceFromPreviousPlanet;
        }
        return spaceFromSun+spaceFromFirstPlanetToSun;
    }
}

