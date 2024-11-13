package interfaces;

public class DemoImpl implements Demo1, Demo2 {
    @Override
    public void demo() {
        Demo1.super.demo();
    }

}
