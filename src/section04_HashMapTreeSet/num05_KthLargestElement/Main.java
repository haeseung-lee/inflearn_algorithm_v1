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
//        System.out.println(main.solution(n, k, arr));
        System.out.println(main.solution2(n, k, arr));
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
    private int solution2(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int l = j+1; l < n; l++){
                    //for 문 3개 다 n 까지로 조건을 해도
                    //숫자가 커지면 조건이 false 가 되어 이중, 삼중 for 문 실행 안됨
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : treeSet){
            cnt++;
            if(cnt == k){
                return x;
            }
        }
        return answer;
    }
}
