package section07_RecursiveAndTreeAndGraph.num06_GenerateAllSubsets;

import java.util.Scanner;

public class Main {
    //자연수 n이 주어지면 1부터 N까지의 원소를 갖는 부분집합을 모두 출력
    //공집합은 출력하지 않음
    static int n;
    static int[] ch; //사용유무 체크 배열 (0: 미사용, 1: 사용)
    private void DFS(int L){
        if(L == n+1){
            String tmp = "";
            for(int i=1; i <=n; i++){
                if(ch[i] == 1){
                    tmp += i + " ";
                }
            }
            //공집합이 아닌경우만 출력
            if(tmp.length() > 0){
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1; //
            DFS(L+1); //좌
            ch[L] = 0;
            DFS(L+1); //우
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Main main = new Main();
        ch = new int[n+1];
        main.DFS(1);
    }
}
