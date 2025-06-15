package section05_StackAndQueue.num06_SavingThePrincess;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Main main = new Main();
        System.out.println(main.solution(n, k));
    }

    private int solution(int n, int k) {
        int answer = 0;

        Queue<Integer> que = new ArrayDeque<>();
        int tmp = 0;
        while(que.size() < n){
            tmp++;
            que.add(tmp);
        }
        tmp = 0;
        while(que.size() > 1){
            tmp++;
            if(tmp != k){
                que.add(que.poll());
            } else {
                tmp = 0;
                que.poll();
            }
        }
        answer = que.poll();
        return answer;
    }

    private int solution2(int n, int k){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            Q.offer(i);
        }
        while (!Q.isEmpty()){
            for(int i = 1; i < k; i++){
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size() == 1){
                answer = Q.poll();
            }
        }
        return answer;
    }
}
