package section02_Array.num02_VisibleStudent;

import java.util.Scanner;

public class Main {
    //맨 앞에서 보이는 학생의 수 구하기
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();

        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = in.nextInt();
        }

        Main m = new Main();
        System.out.println(m.solution(arr));
}

    private int solution(int[] arr) {
        int answer = 1;
        int min = arr[0];

        for(int i = 1; i < arr.length; i ++){
            if(min < arr[i]){
                answer++;
                min = arr[i];
            }
        }
        return answer;
    }
}
