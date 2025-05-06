package section01_String.num02_CaseConversion;

import java.util.Scanner;

public class Main {

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
        }
        return sb.toString();
    }
}
