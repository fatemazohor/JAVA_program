package q2generic;

public class GenericClass<E> {
    E object;

    public GenericClass() {
    }

    public GenericClass(E object) {
        this.object = object;
    }

    public E getObject() {
        return object;
    }

    public void setObject(E object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenericClass{" + "object=" + object + '}';
    }
    
    public <E> int typeCasting(E value){
        int m =(Integer)value;
        return 1;
    }
    S
}
