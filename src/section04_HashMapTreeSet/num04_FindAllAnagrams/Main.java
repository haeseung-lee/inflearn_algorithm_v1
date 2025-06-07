package section04_HashMapTreeSet.num04_FindAllAnagrams;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        Main main = new Main();
        System.out.println(main.solution(s, t));
    }

    private int solution(String s, String t) {
        int answer = 0;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(char x : t.toCharArray()){
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }
        char[] arr = s.toCharArray();
        for(int i = 0; i < t.length()-1; i++){
            sMap.put(arr[i], sMap.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for(int rt = t.length()-1; rt < s.length(); rt++){
            sMap.put(arr[rt], sMap.getOrDefault(arr[rt], 0) + 1);
            if(sMap.equals(tMap)){
                answer++;
            }
            sMap.put(arr[lt], sMap.getOrDefault(arr[lt], 0) - 1);
            if(sMap.get(arr[lt]) == 0){
                sMap.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }
}
