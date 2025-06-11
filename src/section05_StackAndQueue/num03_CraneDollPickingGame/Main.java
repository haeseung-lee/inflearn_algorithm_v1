package section05_StackAndQueue.num03_CraneDollPickingGame;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    /*
    * 크레인 인형뽑기
    * 인형이 집어지지 않는 경우는 없음
    * 0은 빈칸, 빈칸일때 아무일도 없음
    * 같은 인형 두개가 연속해서 쌓이면 두 인형은 터지면서 사라짐
    * 터트려서 사라진 인형의 개수 출력
    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] move = new int[m];
        for(int i = 0; i < m; i++){
            move[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution2(n, board, m, move));
    }
    private int solution2(int n, int[][] board, int m, int[] move) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : move){
            for(int i =0; i < board.length; i++){
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == (tmp)){
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
