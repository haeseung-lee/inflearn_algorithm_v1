package section03_TwoPointerAndSlidingWindow.section04_Subarray;

import java.util.Scanner;

public class Main {
    //n개의 수로 이루어진 수열
    //연속되는 부분의 합이 m이 되는 경우가 몇번 있는지
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        Main main = new Main();
        System.out.println(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {

        int answer = 0;
        int p1 = 0; //왼쪽
        int p2 = 0; //오른쪽
        int sum = 0;
        while(p2 < n){
            if(sum == m){
                //같으면 한칸씩 이동 시킨다.(왼쪽거 빼기 && 오른쪽거 더하기)
                answer++;
                sum -= arr[p1++];
                sum += arr[p2++];
            } else if(sum < m){
                //합이 m보다 작으면 크기를 늘린다(오른쪽거 더하기)
                sum += arr[p2++];
            } else {
                //합이 m보다 크면 크기를 줄인다(왼쪽꺼 빼기)
                sum -= arr[p1++];
            }
        }
        //수열의 마지막을 더했을때 같은 경우 체크
        if(sum == m){
            answer++;
        }
        return answer;
    }

    private int solution2(int n, int m, int[] arr){
        int answer = 0;
        int sum =0;
        int p1 = 0;
        for(int p2 = 0; p2 < n; p2++){
            //오른쪽 더하기
            sum += arr[p2];
            if(sum == m){
                answer++;
            }
            //합이크면 왼쪽을 빼면서 합이 같아지는 경우를 찾기
            while(sum >=m){
                sum -= arr[p1++];
                if(sum == m){
                    answer++;
                }
            }
        }
        return answer;
    }
}