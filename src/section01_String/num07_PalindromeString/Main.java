package section01_String.num07_PalindromeString;

import java.util.Scanner;

public class Main {
    //회문문자열
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Main m = new Main();
        System.out.println(m.solution(str));
    }

    private String solution(String str){
        String answer = "YES";

        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt){
            if(Character.toLowerCase(str.charAt(lt)) != Character.toLowerCase(str.charAt(rt))){
                answer = "NO";
                break;
            } else {
                lt++;
                rt--;
            }
        }
        return answer;
    }

    private String solution2(String str){
        String answer = "NO";
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverseSb = new StringBuilder(str).reverse();

        if(sb.toString().equalsIgnoreCase(reverseSb.toString())){
            answer = "YES";
        }
        return answer;
    }
}
