package OOP.Animal;

public class Main {
    public static void main ( String[] args ) {
        Chicken chicken = new Chicken ();
       // System.out.println (chicken.makeSound ());
        //System.out.println (chicken.howtoEat ());;

        Tiger tiger = new Tiger ();
        //System.out.println (tiger.makeSound ());

        Animal[] animals = new Animal[2];
        animals[0]= chicken;
        animals[1] = tiger;
        for(Animal ani: animals){
            System.out.println (ani.makeSound ());

            if(ani instanceof Chicken){
                Edible edible = (Chicken) ani;
                System.out.println ();
                System.out.println (edible.howtoEat ());
            }
        }


    }
}
