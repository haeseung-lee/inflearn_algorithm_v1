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

        int lt = 0;
        int rt = charArr.length-1;

        boolean isLeftAlphabet = false;
        boolean isRightAlphabet = false;

        while(lt < rt){
            if((charArr[lt] >= 65 && charArr[lt] <= 90) || (charArr[lt] >= 97 && charArr[lt] <= 122)){
                isLeftAlphabet = true;
            }
            if((charArr[rt] >= 65 && charArr[rt] <= 90) || (charArr[rt] >= 97 && charArr[rt] <= 122)){
                isRightAlphabet = true;
            }

            if(isLeftAlphabet && isRightAlphabet){
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;

                isLeftAlphabet = false;
                isRightAlphabet = false;
                rt--;
                lt++;
            } else if (isLeftAlphabet){
                rt--;
            } else {
                lt++;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }

    //isAlphabetic 활용
    private String solution2(String strArr){
        String answer;

        char[] charArr = strArr.toCharArray();

        int lt = 0;
        int rt = charArr.length-1;

        while(lt < rt){

            if(!Character.isAlphabetic(charArr[lt])){
                lt++;
            } else if(!Character.isAlphabetic(charArr[rt])){
                rt--;
            } else {
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;

                lt++;
                rt--;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }
}
