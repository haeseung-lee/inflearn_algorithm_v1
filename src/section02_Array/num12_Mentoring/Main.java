package section02_Array.num12_Mentoring;

import java.util.Scanner;

public class Main {
    //멘토 멘티 구하기
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        Main main = new Main();
        System.out.println(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[][] arr) {
        int answer = 0;

        //학생 A 번호
        for(int i = 1; i <= n; i++){
            //학생 B 번호
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                //시험 회차
                for(int k = 0; k < m; k++){
                    int pi = 0;
                    int pj = 0;
                    for(int l = 0; l < n; l++) {
                        //회차별 모바일 학생 A,등수
                        if (arr[k][l] == i) {
                            pi = l;
                        }
                        //회차별 모바일 학생 B,등수
                        if (arr[k][l] == j) {
                            pj = l;
                        }
                    }
                    if(pi<pj){
                        cnt++;
                    }
                }
                if(cnt == m){
                    answer++;
                }
            }
        }
        return answer;
    }
}
