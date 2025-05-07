package section01_String.num03_FindTheLongestWord;

import java.util.Scanner;

public class Main {
    //문장속 가장 긴 단어 찾기
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        Main m = new Main();
        System.out.println(m.solution3(str));

        in.close();
    }

    String solution(String str){

        String[] strArr = str.split(" ");
        String answer = strArr[0];

        for(int i = 1; i < strArr.length; i++){
            String temp = strArr[i];
            if(answer.length() < temp.length()){
                answer = temp;
            }
        }
        return answer;
    }

    String solution2(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;

        for(String s : str.split(" ")){
            int len = s.length();
            if(m < len){
                m = len;
                answer = s;
            }
        }
        return answer;
    }

    //indexOf 와 subString 활용
    String solution3(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        int idx;

        while((idx=str.indexOf(" ")) != -1){
            String temp = str.substring(0, idx);
            int len = temp.length();

            if(m < len){
                m = len;
                answer = temp;
            }

            str = str.substring(idx+1);
        }

        if(m < str.length()){
            answer = str;
        }
        return answer;
    }
}
