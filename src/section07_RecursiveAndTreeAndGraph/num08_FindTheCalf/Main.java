package section07_RecursiveAndTreeAndGraph.num08_FindTheCalf;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int E = in.nextInt();
        System.out.println(main.BFS(S, E));

    }

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    private int BFS(int s, int e){
        //최대길이가 10000;
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int x = Q.poll();
//                if(x == e){
//                    return L;
//                }
                for(int j = 0; j < dis.length; j++){
                    int nx = x + dis[j];
                    if(nx == e){
                        return ++L;
                    }
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }
}

