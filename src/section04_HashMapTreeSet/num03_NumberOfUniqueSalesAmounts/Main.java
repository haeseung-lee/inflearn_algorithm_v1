package section04_HashMapTreeSet.num03_NumberOfUniqueSalesAmounts;

import java.util.*;

public class Main {
    //n일 동안 연속된 k일 동안의 매출액의 종류를 구간별로 구하기
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Main main = new Main();

        for(int x : main.solution(n, k, arr)){
            System.out.print(x + " ");
        }
    }

    private List<Integer> solution(int n, int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }

        int lt = 0;
        List<Integer> list = new ArrayList<>();
        for(int rt = k-1; rt < n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            list.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) -1);
            if(map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }
            lt++;
        }
        return list;
    }
}
