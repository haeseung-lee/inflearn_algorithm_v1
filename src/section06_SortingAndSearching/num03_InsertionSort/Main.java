package section06_SortingAndSearching.num03_InsertionSort;

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
        for(int x : main.solution(arr)){
            System.out.print(x + " ");
        }
    }

    private int[] solution(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            int tmp = arr[i];
            int j;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
}
