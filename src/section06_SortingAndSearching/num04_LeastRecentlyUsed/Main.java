package section06_SortingAndSearching.num04_LeastRecentlyUsed;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /*
    * 가장 오랫동안 사용하지 않은 것을 제거
    * 맨 앞이 가장 최근에 쓰인 작업, 맨 뒤는 가장 오랫동안 쓰이지 않은 작업
    * 새로운 작업이 추가되면
    *   - s(size)를 초과하는 작업은 제거
    *   - 모든 작업은 뒤로 밀림
    *   -  새 작업 맨 앞에 위치
    * 추가되는 작업이 존재한다면
    *   - 맨 앞으로 이동
    *   - 나머지 작업은 한칸 씩 밀림
    * */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Main main = new Main();

        for(int x : main.solution(s, n, arr)){
            System.out.print(x + " ");
        }

    }

    private LinkedList<Integer> solution(int s, int n, int[] arr) {

        LinkedList<Integer> que = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(que.contains(arr[i])){
                que.remove((Integer) arr[i]);
                que.addFirst(arr[i]);
            } else if(que.size() >= s){
                que.addFirst(arr[i]);
                que.removeLast();
            } else {
                que.addFirst(arr[i]);
            }
        }
        return que;
    }
}
