package Functional_interface;

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In show");
            }
        };

//        A obj2 = new B();
//        obj2.show();
    }
}
