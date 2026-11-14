package OOPS.principles.Inheritences;

public class BoxWeight extends Box {
    float weight;

    BoxWeight(int w) {
        this.weight = w;
    }
    BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }
}
