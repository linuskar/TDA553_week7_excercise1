package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class CatShelter<T extends Cat> extends AnimalShelter<Cat> {

    @Override
    Cat adoptAnimal(){
        return (Cat) super.adoptAnimal();
    }
   
    void putAnimal(T cat){
        super.putAnimal(cat);
    }

    // void putAnimal(Animal animal)
}
