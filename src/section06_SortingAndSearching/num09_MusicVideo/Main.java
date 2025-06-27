package section06_SortingAndSearching.num09_MusicVideo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Main main = new Main();

        System.out.println(main.solution(n, m, arr));

    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid -1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    private int count(int[] arr, int capacity){
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum = x;
            } else {
                sum+= x;
            }
        }
        return cnt;
    }
}
