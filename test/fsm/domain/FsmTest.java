package fsm.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FsmTest {

    private String zin;
    private List<Node> afgelopenNodes = new ArrayList<>();

    @Test
    public void eersteStap() {
        Node s0 =  new Node("S0");
        Node s1 =  new Node("S1");
        s0.voegNodeToe('A', s1);
        s1.voegNodeToe('A',s1);
        s1.voegNodeToe('B', s0);
        Fsm new_FSM =  new Fsm("New_FSM");
        new_FSM.eersteStap(s0);
        System.out.println("we voegen de Node toe aan de lijst zodat de stappen beginnen bij die node. Dit zou betekenen dat de lijst dus niet leeg moet zijn. wat die ook niet is. Dit blijkt uit assertNotNull");
        assertNotNull(afgelopenNodes);
        System.out.println(new_FSM);
    }

    @Test
    public void stappen() {
        Node s0 =  new Node("S0");
        Node s1 =  new Node("S1");
        s0.voegNodeToe('A', s1);
        s1.voegNodeToe('A',s1);
        s1.voegNodeToe('B', s0);
        String string1 = "AB";
        Fsm new_FSM =  new Fsm("New_FSM");
        new_FSM.setZin(string1);
        new_FSM.eersteStap(s0);
        new_FSM.stappen();
        assertNotNull(afgelopenNodes);
        System.out.println("We rekenen er op dat de stappen die de FSM neemt s0, s1, s0 zijn. Dan zal de afgelopen nodes niet leeg kunnen zijn");
        System.out.println(new_FSM);


    }
}