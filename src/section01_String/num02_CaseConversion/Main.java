package section01_String.num02_CaseConversion;

import java.util.Scanner;

public class Main {
    //대소문자 변환
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Main m = new Main();
        System.out.println(m.solution(str));

        in.close();
    }

    String solution(String str){

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }

            //알파베 소문자 범위 (97~122) 를 이용하여 변환
//            if(c >= 97 && c <= 122){
//                sb.append((char)(c-32));
//            } else {
//                sb.append((char)(c+32));
//            }

        }
        return sb.toString();
    }
}
