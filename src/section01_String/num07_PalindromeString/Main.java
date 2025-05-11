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

        int lt = 0;
        int rt = str.length()-1;
        str = str.toLowerCase();

        while(lt < rt){
            if(str.charAt(lt) != str.charAt(rt)){
                return "NO";
            } else {
                lt++;
                rt--;
            }
        }
        return "YES";
    }

    private String solution2(String str){
        String reverseSb = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(reverseSb)){
            return  "YES";
        }
        return "NO";
    }

    private String solution3(String str){
        int len = str.length();
        str = str.toUpperCase();
        for(int i=0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return "NO";
            }
        }
        return "YES";
    }
}
