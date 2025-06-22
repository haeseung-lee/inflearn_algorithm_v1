package section06_SortingAndSearching.num05_DuplicateCheck;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(n, arr));
    }

    private String solution(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }

        if(arr.length == set.size()){
            return "U";
        } else {
            return "D";
        }
    }


}
