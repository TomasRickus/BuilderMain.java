package patterns.facade;

public class FuelInjector {
    public void on() {
        System.out.println("Turning the fuel injector");
    }

    public void inject() {
        System.out.println("Injecting fuel.");
    }

    public void off() {
        System.out.println("Turning off the injector.");
    }
}