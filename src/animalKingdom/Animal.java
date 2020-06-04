package animalKingdom;

public interface Animal{
    String move(String direction, int distance);
    String eat(String food, int amount);
    String breathe();
    String reproduce(String type, Animal partner, String name);
}