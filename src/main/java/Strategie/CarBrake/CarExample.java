package Strategie.CarBrake;

// référence: https://en.wikipedia.org/wiki/Strategy_pattern#Java
/* Using the Car example */
public class CarExample {
    public static void main(final String[] arguments) {
        // IBrakeBehavior normal = new Brake();
        // Car sedanCar = new Sedan(normal);
        Car sedanCar = new Sedan();
        sedanCar.applyBrake();  // This will invoke class "Brake"

        Car suvCar = new SUV();
        suvCar.applyBrake();    // This will invoke class "BrakeWithABS"

        // set brake behavior dynamically
        suvCar.setBrakeBehavior( new Brake() );
        suvCar.applyBrake();    // This will invoke class "Brake"
    }
}