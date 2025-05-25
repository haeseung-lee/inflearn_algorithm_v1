package section02_Array.num10_CountPeaks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+2][n+2];
        for(int i = 1; i < arr[i].length-1; i++){
            for(int j = 1; j < arr[j].length-1; j++){
                arr[i][j] = in.nextInt();
            }
        }

        Main m = new Main();
        System.out.println(m.solution(n, arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = 0;
        int east;
        int west;
        int south;
        int north;

        for(int i = 1; i < arr[i].length-1; i++){
            for(int j =1; j < arr[j].length-1; j++){
                east = arr[i][j+1];
                west = arr[i][j-1];
                south = arr[i+1][j];
                north = arr[i-1][j];

                if(arr[i][j] > east && arr[i][j] > west && arr[i][j] > south && arr[i][j] > north){
                    answer++;
                };

            }
        }
        return answer;
    }
}
