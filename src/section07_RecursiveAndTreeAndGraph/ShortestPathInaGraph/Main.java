package section07_RecursiveAndTreeAndGraph.ShortestPathInaGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    static int[] dis;
    private void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()){
            int cv = queue.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
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
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        main.BFS(1);
        for(int i = 2; i <= n; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }
}
