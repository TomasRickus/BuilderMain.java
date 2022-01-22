package patterns.facade;

/**
 * Facade peatternas enkapsuliuoja complexine sistemos dali ir paslepia ja nuo vartotojo
 * Kadangi visas kompleksiskumas yra pasleptas ir sudeliotas taip kaip reikia, vartotojui lengviau naudotis programa
 */

public class FacadeMain {

    public static void main(String[] args) {
        //Reikia kad automobilis uzsivestu
        AirFlowController airFlowController = new AirFlowController();
        airFlowController.takeAir();
        CoolingController coolingController = new CoolingController();
        coolingController.setTemperatureUpperLimit(5);
        coolingController.cool(100);
        coolingController.run();
        //...

        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        System.out.println("_________________");
        carEngineFacade.stopEngine();

    }
}
