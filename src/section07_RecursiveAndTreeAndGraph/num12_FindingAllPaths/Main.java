package section07_RecursiveAndTreeAndGraph.num12_FindingAllPaths;

import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int answer = 0;
    static int[][] graph;
    static int[] ch;
    private void DFS(int v){
        if(v == n){ //갈 수 있는 동선
            answer++;
        } else {
            for(int i = 1; i <= n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){//갈 수 있음 && 간 적 없음
                    ch[i] = 1; //지나가면 체크
                    DFS(i);
                    ch[i] = 0;  //0으로 원복
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        Main main = new Main();
        main.DFS(1);
        System.out.println(answer);

    }
}
