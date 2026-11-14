package LamdaExpression;

@FunctionalInterface
public interface LamdaDemo {
//    void print();

    public int add(int a, int b);
}
//class Main implements LamdaDemo{
//    public void print(){
//        System.out.println("Lets see a lamda demo");
//    }
//}

class Main {
    public static void main(String[] args) {
//        LamdaDemo lamdaDemo = () -> System.out.println("Hey Lamda Expression");

        LamdaDemo obj = (x, y) -> {
            return x + y;
//            System.out.println(sum);
        };
        int result = obj.add(5,8);
        System.out.println(result);
    }
}