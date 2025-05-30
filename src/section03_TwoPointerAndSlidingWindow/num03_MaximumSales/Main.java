package section03_TwoPointerAndSlidingWindow.num03_MaximumSales;

import java.util.Scanner;

public class Main {
    //n 개중 연속되는 m개의 최대합 구하기
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        Main main = new Main();

        System.out.println(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {

        int sum = 0;
        for(int i = 0; i < m; i++){
            sum += arr[i];
        }

        int answer = sum;
        for(int i = m; i < n; i++){
            sum += arr[i] - arr[i-m];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
