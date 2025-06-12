package section05_StackAndQueue.num04_PostfixExpressionEvaluation;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.next();
        Main main = new Main();
        System.out.println(main.solution(s));
    }

    private int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray()){
            if(Character.isDigit(x)){
                //연산자가 아니면 stack 에 저장
                stack.push(x - 48);
            } else {
                //연산자를 만나면 stack 에서 값을 꺼내 계산
                //먼저 나오는게 연산자 뒤의 수
                int rt = stack.pop();
                int lt = stack.pop();
                switch(x){
                    case '+' : stack.push(lt + rt); break;
                    case '-' : stack.push(lt - rt); break;
                    case '*' : stack.push(lt * rt); break;
                    case '/' : stack.push(lt / rt); break;
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }
}
