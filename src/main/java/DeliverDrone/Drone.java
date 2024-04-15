package DeliverDrone;

public class Drone {
    private int boxA;
    private int boxB;
    private int boxC;
    private int windowh;
    private int windowl;
    public void getMeasurements(int a, int b, int c, int h, int l) {
        setBoxA(a);
        setBoxB(b);
        setBoxC(c);
        setWindowh(h);
        setWindowl(l);
    }

    public void isBoxFitting() {
        System.out.print("S");
    }

    public int getBoxA() {
        return boxA;
    }

    public void setBoxA(int boxA) {
        this.boxA = boxA;
    }

    public int getBoxB() {
        return boxB;
    }

    public void setBoxB(int boxB) {
        this.boxB = boxB;
    }

    public int getBoxC() {
        return boxC;
    }

    public void setBoxC(int boxC) {
        this.boxC = boxC;
    }

    public int getWindowh() {
        return windowh;
    }

    public void setWindowh(int windowh) {
        this.windowh = windowh;
    }

    public int getWindowl() {
        return windowl;
    }

    public void setWindowl(int windowl) {
        this.windowl = windowl;
    }
}
