package patterns.facade;

public class CoolingController {
    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("Setting upper limit to " + defaultCoolingTemp);
    }

    public void run() {
        System.out.println("Running cooling...");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Cooling to " + maxAllowedTemp);
    }

    public void stop() {
        System.out.println("Stopping the cooling controller");
    }
}