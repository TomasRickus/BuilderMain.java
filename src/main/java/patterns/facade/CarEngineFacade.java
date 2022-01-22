package patterns.facade;

public class CarEngineFacade {

    private static final int DEFAULT_COOLING_TEMP = 50;
    private static final int MAX_ALLOWED_TEMP = 90;
    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();

    public void startEngine() {
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(MAX_ALLOWED_TEMP);
        coolingController.run();
        catalyticConverter.on();
        System.out.println("Engine is on!");
    }

    public void stopEngine() {
        fuelInjector.off();
        catalyticConverter.off();
        coolingController.cool(DEFAULT_COOLING_TEMP);
        coolingController.stop();
        airFlowController.off();
        System.out.println("Engine is off!");
    }

}