package section01_String.num05_FlipTheAlphabet;

import java.util.Scanner;

public class Main {
    //문자열 중 알파벳만 뒤집기
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        String str = in.next();

        Main m = new Main();
        System.out.println(m.solution(str));

        in.close();
    }

    private String solution(String str){
        String answer = "";

        char[] charArr = str.toCharArray();

        int lc = 0;
        int rc = charArr.length-1;

        boolean isLeftAlphabet = false;
        boolean isRightAlphabet = false;

        while(lc < rc){
            if((charArr[lc] >= 65 && charArr[lc] <= 90) || (charArr[lc] >= 97 && charArr[lc] <= 122)){
                isLeftAlphabet = true;
            }
            if((charArr[rc] >= 65 && charArr[rc] <= 90) || (charArr[rc] >= 97 && charArr[rc] <= 122)){
                isRightAlphabet = true;
            }

            if(isLeftAlphabet && isRightAlphabet){
                char temp = charArr[lc];
                charArr[lc] = charArr[rc];
                charArr[rc] = temp;

                isLeftAlphabet = false;
                isRightAlphabet = false;
                rc--;
                lc++;
            } else if (isLeftAlphabet){
                rc--;
            } else {
                lc++;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }
}
