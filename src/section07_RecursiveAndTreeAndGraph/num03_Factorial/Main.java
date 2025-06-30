package section07_RecursiveAndTreeAndGraph.num03_Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Main main = new Main();
        System.out.println(main.solution(n));
    }

    private int solution(int n) {
        if(n == 1){
            return 1;
        } else {
            return n * solution(n-1);
        }
    }
}
