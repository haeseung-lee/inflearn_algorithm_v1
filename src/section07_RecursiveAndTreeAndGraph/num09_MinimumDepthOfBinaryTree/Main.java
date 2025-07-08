package section07_RecursiveAndTreeAndGraph.num09_MinimumDepthOfBinaryTree;

public class Main {
    Node root;
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
    private int DFS(int L, Node root){
        if(root.lt == null && root.rt == null){
            return L;
        } else {
            return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
        }
    }
}

class Node{
    int data;
    Node lt;
    Node rt;

    public Node(int value){
        data = value;
        lt = null;
        rt = null;
    }
}


