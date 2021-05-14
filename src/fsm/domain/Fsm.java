package fsm.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Fsm {

    private String naam;
    private String zin;
    private List<Node> afgelopenNodes = new ArrayList<>();

    public Fsm(String naam) {
        this.naam = naam;
    }

    public String getZin() {
        return zin;
    }

    public void setZin(String zin) {
        this.zin = zin;
    }

    @Override
    public String toString() {
        return "Fsm{" +
                "naam='" + naam + '\'' +
                ", zin='" + zin + '\'' +
                ", afgelopenNodes=" + afgelopenNodes +
                '}';
    }

    public void eersteStap (Node a) {
        this.afgelopenNodes.add(a);
    }

    public void stappen() {
        for (char i : this.zin.toUpperCase(Locale.ROOT).toCharArray()) {
            Node huidigeNode = afgelopenNodes.get(afgelopenNodes.size()-1);
            Node volgende = huidigeNode.volgendeNode(i);
            if (volgende == null) {
                break;
            }
            afgelopenNodes.add(volgende);

        }
    }

}
