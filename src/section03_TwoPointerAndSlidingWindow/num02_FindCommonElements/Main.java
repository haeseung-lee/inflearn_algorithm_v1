package section03_TwoPointerAndSlidingWindow.num02_FindCommonElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] a1 = new int[n];
        for(int i = 0; i < n; i++){
            a1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] a2 = new int[m];
        for(int i = 0; i < m; i++){
            a2[i] = in.nextInt();
        }
        
        Main main = new Main();
        for(int x : main.solution(n,m,a1,a2)){
            System.out.print(x + " ");
        }

    }

    private List<Integer> solution(int n, int m, int[] a1, int[] a2) {
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(a1);
        Arrays.sort(a2);
        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 < m){
            if(a1[p1] < a2[p2]){
                p1++;
            } else if(a1[p1] > a2[p2]){
                p2++;
            } else {
                answer.add(a1[p1]);
                p1++;
                p2++;
            }
        }

        return answer;
    }
}
