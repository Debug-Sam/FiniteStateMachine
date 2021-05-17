package fsm.domain;
import java.util.HashMap;

public class Node {

    private String naam;
    private HashMap<Character, Node> listNextNodes = new HashMap<Character, Node>();

    public Node(String naam) {
        this.naam = naam;
    }

    public void voegNodeToe(char a, Node b) {
        this.listNextNodes.put(a, b);
    }

    @Override
    public String toString() {
        return "Node{" +
                "naam='" + naam + '\'' +
                '}';
    }

    public Node volgendeNode(char x) {
        return this.listNextNodes.get(x);

    }
}
