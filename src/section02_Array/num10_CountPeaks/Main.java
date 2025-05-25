package section02_Array.num10_CountPeaks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
//        int[][] arr = new int[n+2][n+2];
//        for(int i = 1; i < arr[i].length-1; i++){
//            for(int j = 1; j < arr[j].length-1; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        Main m = new Main();
        //System.out.println(m.solution(n, arr));
        System.out.println(m.solution2(n, arr));
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

    int[] dx={-1, 0, 1, 0};
    int[] dy={0,1,0,-1};

    private int solution2(int n, int[][] arr){
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean flag = true;
                for(int k = 0; k < 4; k++){
                    int nx = j + dx[k];
                    int ny = i + dy[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[ny][nx] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }
}
