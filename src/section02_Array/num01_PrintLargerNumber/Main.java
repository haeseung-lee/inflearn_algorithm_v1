package section02_Array.num01_PrintLargerNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //자신의 바로 앞 수보다 큰 수만 출력
    public static void main(String[] args){
        Main m = new Main();
//        Scanner in=new Scanner(System.in);
//        String cnt = in.nextLine();
//        String str = in.nextLine();
//
//        System.out.println(m.solution(cnt, str));

        //solution2.
        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr  = new int[cnt];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int n : m.solution2(cnt, arr)){
            System.out.print(n + " ");
        }
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

    private ArrayList<Integer> solution2(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i = 1; i < n; i++){
            if(arr[i-1] < arr[i]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
