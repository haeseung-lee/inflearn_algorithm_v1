package section02_Array.num08_RankCalculation;

import java.util.*;

public class Main {
    //등수 구하기 - 동일 점수는 같은 등수
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(in.nextInt());
        }

        Main m = new Main();
        m.solution(n, arr);
    }

    private void solution(int n, List<Integer> arr) {

        int[] answer = new int[n];
        List<Integer> sortArr = new ArrayList<>(arr);

        sortArr.sort(Collections.reverseOrder());

        for(int i=0; i<arr.size(); i++){
            answer[i] = sortArr.indexOf(arr.get(i)) + 1;
        }

        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
