package section07_RecursiveAndTreeAndGraph.num04_FibonacciSequence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Main main = new Main();
        fibo = new int[n+1];
        main.solution(n);
        for(int i = 1; i <=n; i++){
            System.out.print(fibo[i] + " ");
        }
    }

    static int[] fibo;
    private int solution(int n) {
        if(fibo[n] > 0){
            return fibo[n];
        }
        if(n == 1){
            return fibo[n] = 1;
        } else if(n ==2){
            return fibo[n] = 1;
        } else {
            return fibo[n] = solution(n-2) + solution(n-1);
        }
    }
}
