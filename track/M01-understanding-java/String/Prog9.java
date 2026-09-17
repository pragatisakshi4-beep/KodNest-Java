public class Prog9 {
    static class Car {
        static void convertKmIntoMiles() {
            System.out.println("Converting KM into Miles .....");
        }
        void calculateMilage() {
            System.out.println("Calculate Milege...");
        }
    }

    public static void main(String[] args) {
        Car.convertKmIntoMiles();
        Car c = new Car();
        c.calculateMilage();
    }
}

