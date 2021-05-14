package fsm.domain;

public class Node {

    private String naam;
    private Node nodeA;
    private Node nodeB;

    public Node(String naam) {
        this.naam = naam;
    }


    public Node getNodeA() {
        return nodeA;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public Node getNodeB(Node s0) {
        return nodeB;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

    @Override
    public String toString() {
        return "Node{" +
                "naam='" + naam + '\'' +
                '}';
    }

    public Node volgendeNode(char x) {
        return switch (x) {
            case 'A' -> nodeA;
            case 'B' -> nodeB;
            default -> null;
        };
    }
}
