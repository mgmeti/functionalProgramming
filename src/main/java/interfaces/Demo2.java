package interfaces;

public interface Demo2 {

    default void demo(){
        System.out.println("Demo method from Demo1 interface");
    }
}
