package section02_Array.num11_TemporaryClassPresident;

import java.util.Scanner;

public class Main {
    //같은 반을 한 학생이 가장 많은 학생 구하기
    //같은 반을 한번 했으면 중복 추가 x
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        Main m = new Main();
        System.out.println(m.solution(n, arr));

    }
    private int solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0;

        for(int i = 1; i <= n; i++){
            int tmp = 0;
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        tmp++;
                        break;
                    }
                }
            }
            if(max < tmp){
                max = tmp;
                answer = i;
            }
        }
        return answer;
    }
}
