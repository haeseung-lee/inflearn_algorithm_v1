package section06_SortingAndSearching.num07_CoordinateSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    /*
    * x, y 좌표가 주어졌을 시 좌표를 오름차순으로 정렬
    * 정렬기준 (x, x가 같을 경우 y)
    * */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);
        for(Point o : list){
            System.out.println(o.x + " " + o.y);
        }
//        int[][] arr = new int[n][2];
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//        Main main = new Main();
//        arr = main.solution(n, arr);
//        for(int i = 0; i < n; i++){
//            System.out.println(arr[i][0] + " " + arr[i][1]);
//        }

    }

    private int[][] solution(int n, int[][] arr) {

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j <n; j++){
                if(arr[i][0] > arr[j][0]){
                    int tmp1 = arr[i][0];
                    int tmp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = tmp1;
                    arr[j][1] = tmp2;
                }
            }
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j <n; j++){
                if(arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1]){
                    int tmp1 = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = tmp1;
                }
            }
        }
        return arr;
    }
}

class Point implements Comparable<Point>{
    public int x;
    public int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}
