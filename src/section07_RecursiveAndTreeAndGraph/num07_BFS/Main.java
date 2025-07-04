package section07_RecursiveAndTreeAndGraph.num07_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    Node root;
    private void BFS(Node root){
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        int L = 0;
        while(!que.isEmpty()){
            int len = que.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; i++){
                Node current = que.poll();
                System.out.print(current.data + " ");
                if(current.lt != null){
                    que.offer(current.lt);
                }
                if(current.rt != null){
                    que.offer(current.rt);
                }
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt =  new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}

class Node {
    int data;
    Node lt;
    Node rt;

    Node(int value){
        data = value;
        lt = null;
        rt = null;
    }
}
