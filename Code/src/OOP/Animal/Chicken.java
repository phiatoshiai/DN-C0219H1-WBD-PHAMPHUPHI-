package OOP.Animal;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound () {
        return "Cục tác - Cục tác";
    }

    @Override
    public String howtoEat () {
        return "Chicken eat: cộc cộc";
    }
}
