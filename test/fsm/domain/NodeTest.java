package fsm.domain;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class NodeTest {

    private HashMap<Character, Node> listNextNodes = new HashMap<Character, Node>();

    @Test
    public void voegNodeToeTest() {
        Node s0 =  new Node("S0");
        Node s1 =  new Node("S1");
        s0.voegNodeToe('A', s1);
        System.out.println("De lijst listNextNodes moet niet meer leeg zijn na het gebruiken van deze functie");
        assertNotNull(listNextNodes);
    }

    @Test
    public void volgendeNodeTest() {
        Node s0 =  new Node("S0");
        Node s1 =  new Node("S1");
        s0.voegNodeToe('A', s1);
        s1.voegNodeToe('A',s1);
        s1.voegNodeToe('B', s0);
        System.out.println(s0.volgendeNode('A'));
        assertNotNull(s0.volgendeNode('A'));
        System.out.println("Bij de test hoort de volgende node s1 te zijn aangezien we de letter A gebruiken");
    }

}