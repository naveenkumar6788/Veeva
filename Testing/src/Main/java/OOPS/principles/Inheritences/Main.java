package OOPS.principles.Inheritences;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.length + " " + box1.width + " " + box1.height);

        Box box2 = new Box(2);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        BoxWeight box3 = new BoxWeight(2, 4, 6, 8);
        System.out.println(box3.length + " "+box3.weight +" "+ box3.height+" "+box3.width);

//        BoxWeight box4 = new Box();

    }
}
