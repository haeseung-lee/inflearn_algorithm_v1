package section06_SortingAndSearching.num08_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
        Arrays.sort(arr);

        int lt = 0;
        int rt = n-1;
        int mid = (lt + rt)/2;
        while (arr[mid] != m){
            if(arr[mid] > m){
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
            mid = (lt + rt)/2;
        }
        answer = mid + 1;
        return answer;
    }
}
