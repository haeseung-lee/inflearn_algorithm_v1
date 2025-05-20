package section02_Array.num05_PrimeNumbers;

import java.util.Scanner;

public class Main {
    //소수의 수 구하기
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        Main m = new Main();
        System.out.println(m.solution(n));
    }

    private int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i; j<=n; j=j+i){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
}
