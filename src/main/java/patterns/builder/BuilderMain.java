package patterns.builder;

import java.util.Date;

public class BuilderMain {

    /**
     * Builder patternas skirtas kurti komplesiskiems objektams, isvengiant daugelio skirtingu
     * kostruktoriu kurimu su daug parametru.
     */

    public static void main(String[] args) {
        Task pirmaUzduotis = new Task(1, "Nuvalyti langus", "Virtuves langai", false, new Date());
        Task antraUzduotis = new Task(1, "Nuvalyti langus", null, false, null);

        Task treciaUzduotis = new TaskBuilder()
                .setId(3)
                .setDeadline(new Date())
                .setIsDone(true)
                .setDescription("Bla")
                .setSummary("Bla bla")
                .build();


        Task ketvirtaUzduotis = new Task();
        //reikia kviesti funkcija kuri is DB istraukia data
        ketvirtaUzduotis.setDeadline(new Date());
        ketvirtaUzduotis.setId(5);
        ketvirtaUzduotis.setDescription("asasadas");

        Task penktaUzduotis = new TaskBuilder().setDeadline(new Date()).setDescription("asdas").setSummary("sadas").build();

        Computer asus = Computer.builder().name("Asus").brand("Good").price(1500).isGood(true).build();
        System.out.println(asus);
    }
}
