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
        System.out.println(main.solution2(s1, s2));
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

    /*
    * 처음 문자열로 hashMap 구성(k:문자, v:갯수)
    * 두번째 문자열로 hashMap 에 있는 같은 문자의 갯수 줄이기
    * 같은 문자가 없거나 더 줄일 수 없을 때 NO를 return
    * */
    private String solution2(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return "NO";
            }
            map.put(c, map.get(c) - 1);
        }
        return "YES";
    }
}
