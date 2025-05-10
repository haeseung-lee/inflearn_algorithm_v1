package section01_String.num06_RemoveDuplicateCharacters;

import java.util.Scanner;

public class Main {
    //중복문자 제거
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.next();

        Main m = new Main();
        System.out.println(m.solution(str));
    }

    private String solution(String str){
        StringBuilder answer = new StringBuilder();

        for(char c : str.toCharArray()){
            if(answer.indexOf(String.valueOf(c)) < 0){
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
