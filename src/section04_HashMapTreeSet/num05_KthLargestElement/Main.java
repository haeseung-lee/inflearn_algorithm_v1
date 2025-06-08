package section04_HashMapTreeSet.num05_KthLargestElement;

import java.util.*;

public class Main {
    /*
    * 1~100 까지 자연수
    * 3장을 뽑아 더한 값을 기록하여
    * 그 중 K번째 큰 수를 출력
    * K번째 수가 없으면 -1을 출력
    * */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        Main main = new Main();
        System.out.println(main.solution(n, k, arr));
    }

    private int solution(int n, int k, int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int sum = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int l = j+1; l < n; l++){
                    sum = arr[i] + arr[j] + arr[l];
                    treeSet.add(sum);
                }
            }
        }
        List<Integer> list = new ArrayList<>(treeSet);
        if(list.size() < k){
            return -1;
        }
        list.sort(Collections.reverseOrder());

        return list.get(k-1);
    }
}
