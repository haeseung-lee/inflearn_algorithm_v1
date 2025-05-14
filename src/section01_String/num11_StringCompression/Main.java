package section01_String.num11_StringCompression;

import java.util.Scanner;

public class Main {
    //문자열압축
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();

        Main m = new Main();
        System.out.println(m.solution(str));
    }

    private String solution(String str) {
        StringBuilder answer = new StringBuilder();
        answer.append(str.charAt(0));

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(answer.toString().charAt(answer.length()-1) == str.charAt(i)){
                count++;
            } else {
                answer.append(count)
                        .append(str.charAt(i));
                count = 1;
            }
        }
        answer.append(count);
        return answer.toString().replace("0", "")
                .replace("1","");
    }

    private String solution2(String str){
        StringBuilder answer = new StringBuilder();
        str += " ";
        int count = 1;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            } else {
                answer.append(str.charAt(i));
                if(count > 1){
                    answer.append(count);
                }
                count = 1;
            }
        }
        return answer.toString();
    }
}
