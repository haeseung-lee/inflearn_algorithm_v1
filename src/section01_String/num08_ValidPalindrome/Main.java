package section01_String.num08_ValidPalindrome;

import java.util.Scanner;

public class Main {

    //팰린드롬 여부확인, 알파벳만 비교
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String str = in.nextLine();

        Main m = new Main();
        System.out.println(m.solution(str));
    }

    private String solution(String str){

        str = str.toLowerCase();
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = charArr.length-1;

        while(lt < rt){
            if(!Character.isLetter(charArr[lt])){
                lt++;
            } else if(!Character.isLetter(charArr[rt])){
                rt--;
            } else if(charArr[lt] != charArr[rt]){
                return "NO";
            } else {
                lt++;
                rt--;
            }
        }
        return "YES";
    }
}
