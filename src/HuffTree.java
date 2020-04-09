public class HuffTree {
    private Node root = null;
    private int counter = 0;

    public HuffTree(){
        root = new NYT(256);
        counter++;
    }

    public Node searchHuff(int symbol){
        Node current = root;
        Node leaf = null;

        while(true){
            if(current instanceof NYT){
                return current;
            }

            leaf = current.getChildren()[1];
            if(leaf.getCode() == symbol){
                return leaf;
            }
            else {
                current = current.getChildren()[0];
            }
        }
    }

    public void addSymbol(int symbol){
//        Node leafToInc =
    }
}
