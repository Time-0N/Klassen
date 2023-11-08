public class Main {

    public static void main(String[] args) {
        Car firstCar = new Car("Mercedes", "GT Coupé", "Grey", 2014, 80);

        System.out.println("Speed of first car: " + firstCar.kmh);

        Car secondCar = new Car("Toyota", "Corolla", "Rot", 2023, 70);


        System.out.println("Speed of second car: " + secondCar.kmh);

        Person firstPerson = new Person("Andreas", 34, 'M');
        Person secondPerson = new Person("Mrs. Puff from Spongebob",44,'W');

    }
}
