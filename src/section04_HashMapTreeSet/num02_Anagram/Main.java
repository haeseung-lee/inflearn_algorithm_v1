package section04_HashMapTreeSet.num02_Anagram;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    //Anagram
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        
        Main main = new Main();
        System.out.println(main.solution(s1, s2));
    }

    private String solution(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        for(char c : s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        for(char key : map1.keySet()){
            int cnt = map2.getOrDefault(key, 0);
            if(cnt == 0 || cnt != map1.get(key)){
                return "NO";
            }
        }
        return "YES";
    }
}
