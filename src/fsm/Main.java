package fsm;

import fsm.domain.Fsm;
import fsm.domain.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // de test voor de formatieve opdracht
        Node s0 = new Node("S0");
        Node s1 = new Node("S1");
        Node s2 = new Node("S2");
        Node s3 = new Node("S3");

        s0.voegNodeToe('A', s2);
        s0.voegNodeToe('B', s1);
        s1.voegNodeToe('A', s1);
        s1.voegNodeToe('B', s2);
        s2.voegNodeToe('B', s3);
        s3.voegNodeToe('A', s3);
        s3.voegNodeToe('B', s0);

        String string1 = "BAAB";
        Fsm new_FSM =  new Fsm("New_FSM");
        new_FSM.setZin(string1);
        new_FSM.eersteStap(s0);
        new_FSM.stappen();
        System.out.println(new_FSM);


        // de test voor de summatieve opdracht
        Node p0 = new Node("P0");
        Node p1 = new Node("P1");
        Node p2 = new Node("P2");
        Node p3 = new Node("P3");
        Node p4 = new Node("P4");
        Node p5 = new Node("P5");

        p0.voegNodeToe('A', p1);
        p0.voegNodeToe('X', p5);
        p1.voegNodeToe('A', p2);
        p1.voegNodeToe('X', p5);
        p2.voegNodeToe('A', p3);
        p2.voegNodeToe('X', p5);
        p3.voegNodeToe('A', p4);
        p3.voegNodeToe('X', p5);
        p4.voegNodeToe('A', p5);
        p4.voegNodeToe('X', p5);
        p5.voegNodeToe('A', p0);
        p5.voegNodeToe('X', p5);

        String string2 = "AXA";
        Fsm new_FSM2 =  new Fsm("New_FSM");
        new_FSM2.setZin(string2);
        new_FSM2.eersteStap(p2);
        new_FSM2.stappen();
        System.out.println(new_FSM2);

    }
}
