package section05_StackAndQueue.num01_ValidParentheses;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Main main = new Main();
        System.out.println(main.solution(s));
    }

    private String solution(String s) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '('){
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return answer;
    }
}
