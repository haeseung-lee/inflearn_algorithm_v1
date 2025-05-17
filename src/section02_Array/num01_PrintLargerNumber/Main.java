package section02_Array.num01_PrintLargerNumber;

import java.util.Scanner;

public class Main {
    //자신의 바로 앞 수보다 큰 수만 출력
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String cnt = in.nextLine();
        String str = in.nextLine();

        Main m = new Main();
        System.out.println(m.solution(cnt, str));

    }

    private String solution(String cnt, String str){
        StringBuilder answer = new StringBuilder();
        String s = "0 " + str;
        String[] sArr = s.split(" ");

        for(int i = 1; i < sArr.length; i++){
            int tmp1 = Integer.parseInt(sArr[i-1]);
            int tmp2 = Integer.parseInt(sArr[i]);
            if(tmp1 < tmp2){
                answer.append(tmp2)
                        .append(" ");
            }
        };
        return answer.toString();
    }
}
