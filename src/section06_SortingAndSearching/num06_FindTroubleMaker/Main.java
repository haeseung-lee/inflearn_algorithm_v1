package section06_SortingAndSearching.num06_FindTroubleMaker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    * 오름차순으로 키를 세운다
    * 키순으로 1~N까지 번호를 부여
    * 앞번호를 받고 싶어 자리를 바꿈
    * 자리를 바꾼 사람들이 받은 번호를 차례로 출력
    * */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(in.nextInt());
        }
        Main main = new Main();
        for(int x : main.solution(n, list)){
            System.out.print(x + " ");
        }
    }

    private int[] solution(int n, ArrayList<Integer> list) {
        int[] answer = new int[2];
        int cnt = 0;
        int pos1 = 0;
        int pos2 = 0;
        for(int i = 0; i < n-1; i++){
            if(list.get(i) > list.get(i+1)){
                if(cnt == 0){
                    cnt++;
                    pos1= i;
                } else {
                    pos2 = i+1;
                }
            }
        }
        answer[0] = list.indexOf(list.get(pos1)) + 1;
        answer[1] = ++pos2;
        if(answer[0] > answer[1]){
            answer[1] = pos1 + 2;
        }
        return answer;
    }
}
