public class Car {
    String marke;
    String modell;
    String farbe;
    int baujahr;
    int kmh;

    Car(String marke, String modell, String farbe, int baujahr, int kmh) {
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.kmh = kmh;

        kmh = speedUpCar();
    }
    public int speedUpCar() {
        kmh += 10;
        return kmh;
    }
}
