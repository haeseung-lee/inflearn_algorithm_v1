package section03_TwoPointerAndSlidingWindow.num05_SumOfConsecutiveNaturalNumbers;

import java.util.Scanner;

public class Main {
    //자연수 n 이 주어졌을 때, 연속된 즈연수의 합이 n이 되는 가짓수
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Main main = new Main();
        System.out.println(main.solution(n));
    }

    private int solution(int n) {
        int answer = 0;
//        int[] arr = new int[n-1];//연속된 자연수의 합으로 n은 제외
        int[] arr = new int[n/2 + 1];//연속된 자연수의 합이므로 n을 2로 나눈 몫의 +1 까지만 필요
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        int lt = 0;
        int sum = 0;

        for(int rt = 0; rt < arr.length; rt++){
            sum += arr[rt];
            if(sum == n){
                answer++;
            }
            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n){
                    answer++;
                }
            }
        }

        return answer;
    }
}
