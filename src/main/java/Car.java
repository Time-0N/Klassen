public class Car {
    String marke;
    String modell;
    String farbe;
    int baujahr;
    int kmh;

    Car(String marke, String modell, String farbe, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.kmh = 0;

        startCar();

        kmh = speedUpCar();
    }
    public int speedUpCar() {
        while (kmh<100) {
            System.out.println("Speed of " + modell + " is: " + kmh);
            kmh += 10;
        }
        return kmh;
    }
    public void startCar() {
        System.out.println("StartedCar");
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
}
