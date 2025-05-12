package section01_String.num09_ExtractNumbers;

import java.util.Scanner;

public class Main {
    //숫자만 추출
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();

        Main m = new Main();
        System.out.println(m.solution(str));
    }

    private int solution(String str){
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(str);
    }

    //0~9 : x >= 48 && x<=57
    private int solution2(String str){
        int answer = 0;

        for(char c : str.toCharArray()){
            if(c >= 48 && c <= 57){
                answer = answer*10 + (c -48);
            }
        }
        return answer;
    }

    private int solution3(String str){
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
