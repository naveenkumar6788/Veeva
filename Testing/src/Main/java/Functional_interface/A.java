package Functional_interface;

@FunctionalInterface
public interface A {

//    default void show() {
//        System.out.println("Hello, This is a show A");
//    }

    void show();
}

//
//class B implements A {
//    public void show() {
//        System.out.println("In show B");
//    }
//}