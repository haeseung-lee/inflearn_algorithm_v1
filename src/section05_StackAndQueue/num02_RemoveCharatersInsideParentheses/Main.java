package section05_StackAndQueue.num02_RemoveCharatersInsideParentheses;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    //괄호 안 문자 제거
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Main main = new Main();
        System.out.println(main.solution(s));
    }

    private String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == ')'){
                while(stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }
        for(char x : stack){
            answer.append(x);
        }
        return answer.toString();
    }
}
