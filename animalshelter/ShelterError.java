package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class ShelterError {

    public static void main(String[] args){
        CatShelter<Cat> catShelter = new CatShelter<>();
        Cat badBoyRex = new Cat();

        catShelter.putAnimal(badBoyRex);
        System.out.println("Who let the dogs out?!?");
    }
}
