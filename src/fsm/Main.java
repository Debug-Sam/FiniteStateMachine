package fsm;

import fsm.domain.Fsm;
import fsm.domain.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Node s0 = new Node("S0");
        Node s1 = new Node("S1");
        Node s2 = new Node("S2");
        Node s3 = new Node("S3");

        s0.setNodeA(s2);
        s0.setNodeB(s1);
        s1.setNodeA(s1);
        s1.setNodeB(s2);
        s2.setNodeB(s3);
        s3.setNodeA(s3);
        s3.getNodeB(s0);



        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        Fsm new_FSM =  new Fsm("New_FSM");
        new_FSM.setZin(str);
        new_FSM.eersteStap(s0);
        new_FSM.stappen();
        System.out.println(new_FSM);


    }
}
