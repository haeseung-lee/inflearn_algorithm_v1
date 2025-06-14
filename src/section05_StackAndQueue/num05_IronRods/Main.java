package section05_StackAndQueue.num05_IronRods;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Main main = new Main();
        System.out.println(main.solution(str));
    }

    private int solution(String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                //여는 괄호는 무조건 stack 에 저장
                stack.push(str.charAt(i));
            } else {
                //닫는 괄호를 만나면 stack 에서 제거(레이저 or 막대기의 끝)
                stack.pop();
                if(str.charAt(i-1) == '('){
                    //닫는 괄호 바로 앞이 여는 괄호면 레이저
                    //+ 절단된 막대기 갯수(stack.size)
                    answer += stack.size();
                } else {
                    //닫는 괄호를 만나면 막대기의 끝
                    //+ 막대기 자투리(1)
                    answer++;
                }
            }
        }
        return answer;
    }
}
