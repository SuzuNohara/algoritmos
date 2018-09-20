import java.util.List;
import java.util.ArrayList;

public class BFSNode{
    public String name;
    public List<BFSNode> neig;
    public int visited;

    public BFSNode(String name){
        this.name = name;
        visited = 0;
        neig = new ArrayList<BFSNode>();
    }

    public void setNeig(BFSNode[] nodos){
        for(BFSNode nodo: nodos){
            neig.add(nodo);
        }
    }
}