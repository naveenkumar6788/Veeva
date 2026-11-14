package StaticExamples;
// This is a example of static initialization
public class StaticBlock {
    static int a = 5;
    static int b;

//  When the class is loaded for the first time the it runs and runs only once
    static {
        System.out.println("I am a static class");//it runs once when the first time object is being created
        b = a * 2;
    }
    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);

//        System.out.println("I am a new Static object");
//        StaticBlock obj2 = new StaticBlock();
        a = 20;
        b = 10;
        System.out.println(StaticBlock.a +" "+StaticBlock.b);
    }
}
