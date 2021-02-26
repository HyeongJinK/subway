package khj.test;

public class Connect {
    int idx;
    int weight;
    boolean transfer = false;

    public Connect(int idx, int weight) {
        this.idx = idx;
        this.weight = weight;
    }

    public Connect(int idx, int weight, boolean transfer) {
        this.idx = idx;
        this.weight = weight;
        this.transfer = transfer;
    }
}
