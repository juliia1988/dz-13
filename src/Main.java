public class Main {
    public static void main(String[] args) {

        SolarSystem planet1 = SolarSystem.MERCURY;
        SolarSystem planet2 = SolarSystem.VENUS;
        SolarSystem planet3 = SolarSystem.EARTH;
        SolarSystem planet4 = SolarSystem.MARS;
        SolarSystem planet5 = SolarSystem.JUPITER;
        SolarSystem planet6 = SolarSystem.SATURN;
        SolarSystem planet7 = SolarSystem.NEPTUNE;
        SolarSystem planet8 = SolarSystem.NEPTUNE;


        System.out.println("Планета: "+ planet3);
        System.out.println("Порядковий номер: "+ planet3.getIdNumber());
        System.out.println("Відстань від попередньої планети: "+ planet3.getSpaceFromPreviousPlanet() + " млн.км");
        System.out.println("Радіус планети: "+ planet3.getRadius());
        System.out.println("Наступна планета: " + planet3.getPreviousPlanet());
        System.out.println("Наступна планета: " + planet3.getNextPlanet());
        System.out.println("Відстань від Neptune до Сонця: "+ planet8.getSpaceFromSun() + " млн.км");
    }


}