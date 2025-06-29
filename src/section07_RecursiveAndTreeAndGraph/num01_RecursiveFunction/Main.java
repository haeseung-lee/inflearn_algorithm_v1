package section07_RecursiveAndTreeAndGraph.num01_RecursiveFunction;

import java.util.Scanner;

public class Main {
    //자연수 n을 입력받으면 재귀함수로 1부터 n까지 출력
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Main main = new Main();
        main.solution(n);
    }

    private void solution(int n) {
        if(n == 0){
            return;
        } else {
            solution(n-1);
            System.out.print(n + " ");
        }
    }
}
