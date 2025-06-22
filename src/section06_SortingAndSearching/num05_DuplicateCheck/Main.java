package section06_SortingAndSearching.num05_DuplicateCheck;

import java.util.Arrays;
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

    private String solution2(int n, int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.get(arr[i]) != null){
                return "D";
            } else {
                map.put(arr[i], 1);
            }
        }
        return "U";
    }

    private String solution3(int n, int[] arr){
        String answer ="U";
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i+1]){
                return "D";
            }
        }
        return answer;
    }
}
