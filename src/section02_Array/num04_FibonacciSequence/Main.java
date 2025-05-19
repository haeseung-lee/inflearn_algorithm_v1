package section02_Array.num04_FibonacciSequence;

import java.util.Scanner;

public class Main {
    //피보나치 수열
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        Main m = new Main();
        for(int i : m.solution(n)){
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < answer.length; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }
}
