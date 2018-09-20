public class BFSMain{
    public static void main(String args[]){
        BFSNode[] nodos = new BFSNode[8];
        BFSNode A = new BFSNode("A");
        BFSNode B = new BFSNode("B");
        BFSNode C = new BFSNode("C");
        BFSNode D = new BFSNode("D");
        BFSNode E = new BFSNode("E");
        BFSNode F = new BFSNode("F");
        BFSNode G = new BFSNode("G");
        BFSNode H = new BFSNode("H");

        A.neig.add(B);
        A.neig.add(F);
        A.neig.add(G);
        B.neig.add(C);
        B.neig.add(D);
        D.neig.add(E);
        G.neig.add(H);
    }

    
}