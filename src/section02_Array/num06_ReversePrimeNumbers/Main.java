package section02_Array.num06_ReversePrimeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //뒤집었을 때 소수 찾기
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();

        String[] sArr = new String[n];
        for(int i=0; i<n; i++){
            sArr[i] = in.next();
        }

        Main m = new Main();

        for(int i : m.solution(n, sArr)){
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int n, String[] sArr) {

        //1. 자연수 뒤집기
        int[] iArr = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            String tmp = new StringBuilder(sArr[i]).reverse().toString();
            if(tmp.charAt(0) == '0'){
                tmp = tmp.substring(1);
            }
            iArr[i] = Integer.parseInt(tmp);
            if(max < iArr[i]){
                max = iArr[i];
            }
        }

        //2.소수리스트
        int[] arr = new int[max+1];
        arr[0] = 1;
        arr[1] = 1;
        List<Integer> primeList = new ArrayList<>();
        for(int i=2; i<=max; i++){
            if(arr[i] == 0){
                primeList.add(i);
                for(int j=i; j<=max; j=j+i){
                    arr[j] = 1;
                }
            }
        }

        //3. 입력값 중 소수만 구하기
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            for (Integer integer : primeList) {
                if (iArr[i] == integer) {
                    answer.add(iArr[i]);
                    continue;
                }
            }
        }
        return answer;
    }
}
