package section04_HashMapTreeSet.num01_ClassPresidentElection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //후보 A,B,C,D,E 중 학생회장 선출
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        char[] arr= s.toCharArray();
        Main main = new Main();
        System.out.println(main.solution(n, arr));
    }

    private String solution(int n, char[] arr) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0);
        map.put("E", 0);

        for(int i = 0; i < n; i++){
            int tmp = 0;
            switch(arr[i]){
                case 'A' :  tmp = map.get("A"); map.put("A", ++tmp); break;
                case 'B' :  tmp = map.get("B"); map.put("B", ++tmp); break;
                case 'C' :  tmp = map.get("C"); map.put("C", ++tmp); break;
                case 'D' :  tmp = map.get("D"); map.put("D", ++tmp); break;
                default: tmp = map.get("E"); map.put("E", ++tmp);
            }

        }
        int max = Math.max(map.get("A"), map.get("B"));
        max = Math.max(max, map.get("C"));
        max = Math.max(max, map.get("D"));
        max = Math.max(max, map.get("E"));

        if(map.get("A") == max){
            return "A";
        }
        if(map.get("B") == max){
            return "B";
        }
        if(map.get("C") == max){
            return "C";
        }
        if(map.get("D") == max){
            return "D";
        }
        return "E";
    }
}
