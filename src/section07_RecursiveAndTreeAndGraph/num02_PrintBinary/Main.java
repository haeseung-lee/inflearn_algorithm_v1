package section07_RecursiveAndTreeAndGraph.num02_PrintBinary;

import java.util.Scanner;

public class Main {
    /*재귀함수를 활용한 이진수 출력*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Main main = new Main();
        main.solution(n);
    }

    private void solution(int n) {
        if(n > 0){
            solution(n/2);
            System.out.print(n%2);
        } else {
            return;
        }
    }
}
