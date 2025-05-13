package section01_String.num10_ShortestDistance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //가장 짧은 문자거리
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String str = in.nextLine();

        Main m = new Main();
        m.solution2(str);
    }

    private void solution(String str){
        String[] strArr = str.split(" ");
        String s = strArr[0];
        char t = strArr[1].charAt(0);
        List<Integer> tIdxList = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                tIdxList.add(i);
            }
        }

        int[] answer = new int[s.length()];

        int lt = 0;
        int rt = 1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t){
                answer[i] = 0;
            } else if(i < tIdxList.get(0)){
                answer[i] = tIdxList.get(0) - i;
            } else if(i > tIdxList.get(tIdxList.size()-1)){
                answer[i] = i - tIdxList.get(tIdxList.size()-1);
            } else if(i > tIdxList.get(rt)){
                lt++;
                rt++;
                i--;
            } else{
                int tmp1 = i - tIdxList.get(lt);
                int tmp2 = tIdxList.get(rt) - i;
                answer[i] = Math.min(tmp1, tmp2);
            }
        }

        for(int i : answer){
            System.out.print(i + " ");
        }
    }

    private void solution2(String str){
        String[] strArr = str.split(" ");
        String s = strArr[0];
        char t = strArr[1].charAt(0);

        int p = 1000;
        //왼쪽부터의 거리
        int[] answer = new int[s.length()];
        for(int i = 0; i < answer.length; i++){
            if(s.charAt(i) == t){
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        p = 1000;
        //오른쪽부터의 거리
        for(int i = answer.length-1; i >= 0; i--){
            if(s.charAt(i) == t){
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        for(int i : answer){
            System.out.print(i + " ");
        }
    }
}
