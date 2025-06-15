package section05_StackAndQueue.num07_CurriculumDesign;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    /*
    * 필수과목이 설계한 교육과정에 순서대로 들어있으면 'YES'
    * 아니면 'NO' 를 출력
    * */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        Main main = new Main();
        System.out.println(main.solution(str1, str2));
    }

    private String solution(String str1, String str2) {
        Queue<Character> requiredClass = new LinkedList<>();
        for(char x : str1.toCharArray()){
            requiredClass.offer(x);
        }
        Queue<Character> designedClass = new LinkedList<>();
        for(char x : str2.toCharArray()){
            designedClass.offer(x);
        }

        while(!designedClass.isEmpty()){
            if(designedClass.poll().equals(requiredClass.element())){
                requiredClass.poll();
            }
            if(requiredClass.isEmpty()){
                return "YES";
            }
        }
        return "NO";
    }
}
