package OOPS.principles.Inheritences;

public class Box {
    float length;
    float width;
    float height;

    Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }
    Box(int length) {
        this.length = length;
        this.width = length;
        this.height = length;
    }
    Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }
    Box(Box old) {
        this.length= old.length;
        this.width = old.width;
        this.height = old.height;
    }

}
