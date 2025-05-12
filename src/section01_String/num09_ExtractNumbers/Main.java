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
}
