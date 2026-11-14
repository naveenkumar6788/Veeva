package StaticExamples;

//Since the static doesnot depend on objects so the static methods and all the stuffs which are static they are resolve during compile time
// in simple way i just thought that static means common for all of us

class Test {
    static String name; //what if i write only String name

    Test(String name) {
        Test.name = name;
    }
}
public class InnerClass {

    static class Test {
        String name;

        Test(String name) {
//            Test.name = name;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test obj1 = new Test("Chandan");
        Test obj2 = new Test("Rabi");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
