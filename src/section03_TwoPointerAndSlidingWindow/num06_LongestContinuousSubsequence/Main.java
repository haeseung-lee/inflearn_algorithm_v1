package section03_TwoPointerAndSlidingWindow.num06_LongestContinuousSubsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //길이가 N인 0과 1로 구성된 수열
    //k번 만큼 0을 1로 변경할 수 있음
    //이때 최대 길이의 연속된 1로 구성된 수열의 길이 구하기
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(n, k, arr));
        System.out.println(main.solution2(n, k, arr));
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        //0의 위치를 list에 저장
        List<Integer> zeroList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroList.add(i+1);
            }
        }
        //마지막 길이 계산을 위해 n 추가
        zeroList.add(n);
        //1부터 시작
        //연속이 종료 되는 지점 : 0list 의 k번째 0의 위치
        //다음 시작지점은 : 0list (i-k)에서 +1
        int start = 1;
        for(int i = k; i < zeroList.size(); i++){
            int len = zeroList.get(i)- start;
            answer = Math.max(answer, len);
            start = zeroList.get(i-k)+1;
        }
        return answer;
    }

    //two pointer
    private int solution2(int n, int k, int[] arr){
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0){
                cnt++;
            }
            while(cnt > k){
                if(arr[lt] == 0){
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }
}
