

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        //Skapat en map för att skippa behöva ha lång if sats eller switch sats. Utan istället låta if satsen leta igenom min hashmap med hjälp av nycklar.
        Map<String, Plant> plants = new HashMap<>();
        plants.put("IGGE", new Cactus("Igge", 0.2));
        plants.put("LAURA", new Palm("Laura", 5.0));
        plants.put("OLOF", new Palm("Olof", 1.0));
        plants.put("MEATLOAF", new CarnivorousPlant("Meatloaf", 0.7));


        System.out.println("Välkommen till växthotellet Greenest!");


        while (true) {

            System.out.println("Vilken växt ska få vätska?");
            //Tvingar systemet att göra uppercase på allt så att det aldrig kan bli fel oavsett hur en person skriver namnet.
            String costumerChoice = scanner.nextLine().toUpperCase();
            Plant plantChoice = plants.get(costumerChoice);



            if (plantChoice != null) {
                System.out.println("Din växt " + plantChoice.getPlantName() + " behöver " + plantChoice.nurr() + "L av " + plantChoice.getPlantNurr().toString().toLowerCase());


            } else {
                System.out.println("okänt val, Dessa plantor har vi inne just nu");
                for (Plant p : plants.values()){
                    System.out.println(p.getPlantName());

                }

            }

        }

    }
}