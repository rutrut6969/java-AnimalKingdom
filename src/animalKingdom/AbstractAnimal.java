package animalKingdom;

abstract class AbstractAnimal {

    protected int energy = 0;
    public AbstractAnimal(){
        energy = 1;
    }
    public AbstractAnimal(int energy){
        this.energy = energy;
    }

    abstract String getName();
    abstract int getYear();
    abstract String getAnimalType();
    abstract String getMove();
    abstract String getBreathe();
    abstract String getBirth();
    // void eat(String animal, int amount){
        
    //     if(amount > 0){
    //         energy += amount;
    //         System.out.println(animal + " ate " + amount + " pieces of food.");
    //     } else {
    //         energy++;
    //         System.out.println(animal + " ate some food");
    //     }
        
    // }
    // void move(String animal, int feet, String direction){
    //     energy -= (feet/2);
    //     System.out.println(animal + "Moved " + direction + feet + " Feet");
    // };
    // int getEnergyLevel(){
    //     return energy;
    // }
    

}