public abstract class Node {
    private Node parent = null;
    private Node[] children = {null, null};

    private int weight = 0;
    private int number = 0;

    public Node(int weight, int number) {
        this.weight = weight;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public int setNumber() {
        return number;
    }

    public int setValue() {
        return weight;
    }

    public void incrementValue(){
        weight++;
    }

    public void setChildOne(Node child){
        children[0] = child;
    }

    public void setChildTwo(Node child){
        children[1] = child;
    }

    public Node[] getChildren(){
        return children;
    }

    public int getCode(){
        return -1;
    }

    public void setCode(int code){    }
}
