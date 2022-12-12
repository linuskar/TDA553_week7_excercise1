/**
 * Created by Niklas on 2016-02-07.
 * @param T first object
 * @param U second object
 */
public class Tuple <T, U> {
    private T obj1;  // An object of type T
    private U obj2;  // An object of type U
  
    // constructor
    public Tuple(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public T fst(){
        return this.obj1;
    }

    public U snd(){
        return this.obj2;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((obj1 == null) ? 0 : obj1.hashCode());
        result = prime * result + ((obj2 == null) ? 0 : obj2.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tuple other = (Tuple) obj;
        if (obj1 == null) {
            if (other.obj1 != null)
                return false;
        } else if (!obj1.equals(other.obj1))
            return false;
        if (obj2 == null) {
            if (other.obj2 != null)
                return false;
        } else if (!obj2.equals(other.obj2))
            return false;
        return true;
    }

    // public ... fst(){...}
    // public ... snd(){...}
}
