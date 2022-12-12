package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class DogShelter<T extends Dog> extends AnimalShelter<Dog> {

    @Override
    Dog adoptAnimal(){
        return (Dog) super.adoptAnimal();
    }

    void putAnimal(T dog){
        super.putAnimal(dog);
    }
}
