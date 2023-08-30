package q2generic;

public class TestGeneric<E,T> {
    E object;
    T object1;

    public TestGeneric() {
    }

    public TestGeneric(E object, T object1) {
        this.object = object;
        this.object1 = object1;
    }

    public E getObject() {
        return object;
    }

    public void setObject(E object) {
        this.object = object;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }
    
    public<E,T> void print(E object, T object1){
        System.out.println(object.toString()+" "+ object1.toString());
    
    }
}
