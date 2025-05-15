package section01_String.num12_Cipher;

import java.util.Scanner;

public class Main {

    //암호, #=이진수1, *=이진수0 을 문자로
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count = in.nextInt();
        String str = in.next();

        Main m = new Main();
        System.out.println(m.solution(count, str));
    }

    private String solution(int count, String str) {
        StringBuilder answer = new StringBuilder();
        int idx = 7;

        str = str.replace("#", "1")
                .replace("*","0");

        for(int i = 0; i < count; i++){
            String temp = str.substring(idx-7, idx);
            int n = Integer.parseInt(temp, 2);
            answer.append(Character.toChars(n));
            idx += 7;
        }
        return answer.toString();
    }
}
