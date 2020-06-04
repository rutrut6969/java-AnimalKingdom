package animalKingdom;

public class Mammal extends AbstractAnimal{
    private int maxID = 0;
    private int energy;

    private int ID;
    private String animalType;
    private String name;
    private int yearDiscovered;
    private String favFood;
    private String howMove;
    private String howBreathe;
    private String howBirth;

    public Mammal(String name, String type, int year, String favFood){
        maxID++;
        this.ID = maxID;
        this.name = name;
        this.yearDiscovered = year;
        this.favFood = favFood;
        this.animalType = type;
        this.energy = 10;
        this.howMove = "Walk";
        this.howBreathe = "Lungs";
        this.howBirth = "Live Birth";
    }

    // Animal Functions:
    public String move(String direction, int distance){
        int overUseCount = 0;
        int energyReduc = (distance/2);
        if(energy == 0){
            overUseCount++;
            System.out.println("Sorry but " + this.name + "has run out of energy you must feed them before trying to make them move again!");
            if(overUseCount > 2){
                System.out.println("Sorry but you've tried using " + this.name + " too many times without feeding them. They're now dead.");
            }
        } else if(energy > energyReduc){
            this.energy -= energyReduc;
            System.out.println(this.name + " has walked " + direction + distance + " feet!");
        }
        return "Success";
    }

    public String eat(String food, int amount){
        if(food == this.favFood){
            this.energy += amount * 4;
            System.out.println("You fed " + this.name + " their favorite food: " + this.favFood + " That means the energy amount they get doubles!");

        }else if(amount > 0){
            this.energy += amount * 2;
            System.out.println("You fed " + this.name + " some " + food + "s Good job their energy level increased to: " + this.energy);

        }
        return "Success";
    }

    public String reproduce(String type, Animal partner, String name){
        if(type == this.animalType){
        Mammal baby = new Mammal(this.animalType, name, this.yearDiscovered, this.favFood);
        System.out.println("A new baby has been formed! And their name is " + name + "!!");
        }else{
            System.out.println("I'm sorry but " + partner + "Is not compatible with " + this.name + ". Because they are not of the same animal type");
        }
        return "Success";
    };

    public String breathe(){
        System.out.println(this.name + " Took a breth!");
        return "Success";
    }

    // Getters / Setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYear(){
        return this.yearDiscovered;
    }

    public String getFavFood(){
        return this.favFood;
    }

    public void setFavFood(String food){
        this.favFood = food;
    }

    public String getAnimalType(){
        return this.animalType;
    }

    public String getMove(){
        return this.howMove;
    }
    public String getBreathe(){
        return this.howBreathe;
    }
    public String getBirth(){
        return this.howBirth;
    }
}