package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
//            int c = a / b;
            Divide(a, b);
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static int Divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Pls don't divide by zero");
        }
        return a / b;
    }
}
