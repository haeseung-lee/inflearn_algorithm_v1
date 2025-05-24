package section02_Array.num09_MaximumSumGrid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        int[][] grid = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = in.nextInt();
            }
        }
        Main m = new Main();
        System.out.println(m.solution(n, grid));
    }

    private int solution(int n, int[][] grid) {
        int answer = 0;
        int sum1 = 0; //가로합
        int sum2 = 0; //세로합
        int sum3 = 0; //대각선 합
        int sum4 = 0; //대각석 역순의 합

        //행, 열의 합
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                sum1 += grid[i][j];
                sum2 += grid[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);

            sum1 = 0;
            sum2 = 0;
        }
        //대각선 합
        for(int i = 0; i < n; i++){
            sum3 += grid[i][i];
            sum4 += grid[i][n-1-i];
        }
        answer = Math.max(answer, sum3);
        answer = Math.max(answer, sum4);

        return answer;
    }
}
