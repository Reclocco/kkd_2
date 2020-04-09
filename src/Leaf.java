public class Leaf extends Node {
    private int code = 0;

    public Leaf(int value, int number, int code) {
        super(value, number);
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }
}
