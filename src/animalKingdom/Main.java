package animalKingdom;

import java.util.*;

public class Main {

    public static void main(String[] args){
        // Mammals
        //     | Panda     | 1869  |
        // String name, String type, int year, String favFood
        Mammal Po = new Mammal("Po", "Panda", 1869, "Bamboo");

        //| Zebra     | 1778  |
        Mammal Steve = new Mammal("Steve", "Zebra", 1778, "Tall Grass");

        //| Koala     | 1816  |
        Mammal Bark = new Mammal("Bark", "Koala", 1816, "Tree Leaves");

        //| Sloth     | 1804  |
        Mammal Sid = new Mammal("Sid", "Sloth", 1804, "Tree Bark");

        //| Armadillo | 1758  |
        Mammal Fred = new Mammal("Fred", "Armadillo", 1758, "Insects");

        //| Raccoon   | 1758  |
        Mammal Trash = new Mammal("Trash", "Raccoon", 1758, "Scraps");

        // | Bigfoot   | 2021  |
        Mammal Groot = new Mammal("Groot", "Bigfoot", 2021, "Fresh Meat");

        ///////////////////////////////////////////////////////////////////////////
        // Birds
        //| Pigeon    | 1837 |
        Bird Squak = new Bird("Squak", "Pigeon", 1837, "Bread");

        //| Peacock   | 1821 |
        Bird Rainbow = new Bird("Rainbow", "Peacock", 1821, "Seeds");

        //| Toucan    | 1758 |
        Bird Roucan = new Bird("Roucan", "Toucan", 1758, "Fresh Fruit");

        //| Parrot    | 1824 |
        Bird Polly = new Bird("Polly", "Parrot", 1824, "Cracker");

        //| Swan      | 1758 |
        Bird Pan = new Bird("Pan", "Swan", 1758, "Fish");


        /////////////////////////////////////////////////////////////////////////
        // Fish
        //| Salmon    | 1758 |
        Fish Sam = new Fish("Sam", "Salmon", 1758, "Worms");

        //| Catfish   | 1817 |
        Fish Whiskers = new Fish("Whiskers", "Catfish", 1817, "Chicken Liver");

        //| Perch     | 1758 |
        Fish Perry = new Fish("Perry", "Perch", 1758, "Worms");






        // Lists:

        // General Animals list
        List<AbstractAnimal> animals = new ArrayList<>();
        animals.add(Po);
        animals.add(Steve);
        animals.add(Bark);
        animals.add(Sid);
        animals.add(Fred);
        animals.add(Trash);
        animals.add(Groot);
        animals.add(Squak);
        animals.add(Rainbow);
        animals.add(Roucan);
        animals.add(Polly);
        animals.add(Pan);
        animals.add(Sam);
        animals.add(Whiskers);
        animals.add(Perry);


        List<AbstractAnimal> lungs = new ArrayList<>();

        animals.forEach((a) -> {
            if(a.getBreathe() == "Lungs"){
                lungs.add(a);
            }
        });

        List<AbstractAnimal> lungsAndDiscovered = new ArrayList<>();

        lungs.forEach((a) -> {
            if(a.getYear() == 1758){
                lungsAndDiscovered.add(a);
            }
        });


        List<AbstractAnimal> lungsAndEggs = new ArrayList<>();
        lungs.forEach((a) -> {
            if(a.getBirth() == "Eggs"){
                lungsAndEggs.add(a);
            }
        });

        List<AbstractAnimal> discovered = new ArrayList<>();
        animals.forEach((a) -> {
            if(a.getYear() == 1758){
                discovered.add(a);
            }
        });


        // Cycling Through Animals List to display based on year
        System.out.println("\n ****List all the animals in descending order by year named****");
        animals.sort(Comparator.comparing(o -> (int)o.getYear(), Comparator.reverseOrder()));
        animals.forEach((a) -> System.out.println("\n " + "Name: " + a.getName() + " Year Discovered: " + a.getYear() + " Animal Type: " + a.getAnimalType()));

        // Display All animals by Name:
        System.out.println("\n ***List all the animals alphabetically***");
        animals.sort(Comparator.comparing(a -> (String)a.getName()));
        animals.forEach((a) -> System.out.println("\n " + "Name: " + a.getName() + " Year Discovered: " + a.getYear() + " Animal Type: " + a.getAnimalType()));

        // List all the animals order by how they move
        System.out.println("\n ***List all the animals order by how they move***");
        animals.sort(Comparator.comparing(a -> (String)a.getMove()));
        animals.forEach((a) -> System.out.println("\n " + "Name: " + a.getName() + " Year Discovered: " + a.getYear() + " Animal Type: " + a.getAnimalType() + " Moveability: " + a.getMove()));

        // List only those animals the breath with lungs
        System.out.println("\n ***List only those animals the breath with lungs***");
        lungs.forEach((a) -> System.out.println("\n " + "Name: " + a.getName() + " Year Discovered: " + a.getYear() + " Animal Type: " + a.getAnimalType() + " Moveability: " + a.getMove() + " Breatheability: " + a.getBreathe()));

        // List only those animals that breath with lungs and were named in 1758
        System.out.println("\n ***List only those animals that breath with lungs and were named in 1758***");
        lungsAndDiscovered.forEach((a) -> System.out.println("\n " + "Name: " + a.getName() + " Year Discovered: " + a.getYear() + " Animal Type: " + a.getAnimalType() + " Moveability: " + a.getMove() + " Breatheability: " + a.getBreathe()));


     //List only those animals that lay eggs and breath with lungs
     System.out.println("\n ***List only those animals that lay eggs and breath with lungs***");
     lungsAndEggs.forEach((a) -> System.out.println("\n " + "Name: " + a.getName() + " Year Discovered: " + a.getYear() + " Animal Type: " + a.getAnimalType() + " Moveability: " + a.getMove() + " Breatheability: " + a.getBreathe()));





     //List alphabetically only those animals that were named in 1758
     System.out.println("\n ***List alphabetically only those animals that were named in 1758***");
     discovered.sort(Comparator.comparing(a -> (String)a.getName()));
     discovered.forEach((a) -> System.out.println("\n " + "Name: " + a.getName() + " Year Discovered: " + a.getYear() + " Animal Type: " + a.getAnimalType() + " Moveability: " + a.getMove() + " Breatheability: " + a.getBreathe()));
    }
}