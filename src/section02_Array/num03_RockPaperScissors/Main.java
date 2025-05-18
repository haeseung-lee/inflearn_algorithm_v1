package section02_Array.num03_RockPaperScissors;

import java.util.Scanner;

public class Main {
    //가위 : 1, 바위 : 2, 보 : 3
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i = 0; i < n; i++){
            arrA[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            arrB[i] = in.nextInt();
        }

        Main m = new Main();
        for(String s : m.solution2(n, arrA, arrB)){
            System.out.println(s);
        }
    }

    private String[] solution(int n, int[] arrA, int[] arrB) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            int result = arrA[i] - arrB[i];
            if(result == 2){
                //A : 보, B : 가위
                answer[i] = "B";
            } else if (result == -2){
                //A : 가위, B : 보
                answer[i] = "A";
            } else if(result > 0){
                answer[i] = "A";
            } else if(result < 0){
                answer[i] = "B";
            } else {
                answer[i] = "D";
            }
        }
        return answer;
    }
    //A의 승리 기준으로
    private String[] solution2(int n, int[] arrA, int[] arrB) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                answer[i] = "D";
            } else if (arrA[i] == 1 && arrB[i] == 3) {
                answer[i] = "A";
            } else if (arrA[i] == 2 && arrB[i] == 1) {
                answer[i] = "A";
            } else if (arrA[i] == 3 && arrB[i] == 2) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }
        }
        return answer;
    }
}
