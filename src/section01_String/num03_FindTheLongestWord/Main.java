package section01_String.num03_FindTheLongestWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        Main m = new Main();
        System.out.println(m.solution(str));

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
}
