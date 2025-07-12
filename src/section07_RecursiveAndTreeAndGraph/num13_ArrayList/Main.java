package section07_RecursiveAndTreeAndGraph.num13_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    private void DFS(int v){
        if(v == n){
            answer++;
        } else {
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList<>();
        for(int i = 0; i <=n; i++){
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        main.DFS(1);
        System.out.println(answer);
    }
}
