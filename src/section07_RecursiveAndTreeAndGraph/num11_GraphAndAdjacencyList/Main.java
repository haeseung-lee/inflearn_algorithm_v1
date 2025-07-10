package section07_RecursiveAndTreeAndGraph.num11_GraphAndAdjacencyList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); //노드 수
        int E = sc.nextInt(); //간선 수
        Main main = new Main();
        //main.undirectedGraph(sc, V, E);
        //main.directedGraph(sc, V, E);
        main.weightedDirectedGraph(sc, V, E);
    }

    //무방향 그래프
    private void undirectedGraph(Scanner sc, int v, int e){
        int[][] graph = new int[v+1][v+1];
        for(int i = 0; i < e; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            graph[n][m] = 1;
            graph[m][n] = 1;
        }

        for(int i = 1; i < graph.length; i++){
            for(int j = 1; j < graph[i].length; j++){
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }

    //방향 그래프
    private void directedGraph(Scanner sc, int v, int e){
        int[][] graph = new int[v+1][v+1];
        for(int i = 0; i < e; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            graph[n][m] = 1;
        }

        for(int i = 1; i < graph.length; i++){
            for(int j = 1; j < graph[i].length; j++){
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }

    //가중치 방향 그래프
    private void weightedDirectedGraph(Scanner sc, int v, int e){
        int[][] graph = new int[v+1][v+1];
        for(int i = 0; i < e; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int w = sc.nextInt();
            graph[n][m] = w;
        }
        for(int i = 1; i < graph.length; i++){
            for(int j = 1; j < graph[i].length; j++){
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }
}
