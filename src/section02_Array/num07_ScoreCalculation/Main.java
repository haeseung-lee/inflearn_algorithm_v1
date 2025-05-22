package section02_Array.num07_ScoreCalculation;

import java.util.Scanner;

public class Main {
    //점수 계산 - 정답 1점, 오답 0점, 연속 정답 가산점+1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        Main m = new Main();
        System.out.println(m.solution(n, arr));
    }

    private int solution(int n, int[] arr) {
        int answer = 0;
        int consecutive = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                consecutive++;
                answer += consecutive;
            } else {
                consecutive = 0;
            }
        }
        return answer;
    }
}