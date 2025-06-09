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

        if(s.length()%2 != 0){
            return "NO";
        }

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return answer;
    }
}
