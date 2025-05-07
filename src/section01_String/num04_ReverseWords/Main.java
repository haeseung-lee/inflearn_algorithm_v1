package section01_String.num04_ReverseWords;

import java.util.Scanner;

public class Main {
    //N개의 단어를 뒤집어 출력
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size = in.nextInt();
        String[] strArr = new String[size];

        for(int i = 0; i < size; i++){
            strArr[i] = in.next();
        }

        Main m = new Main();
        m.solution(strArr);
        in.close();
    }

    private void solution(String[] strArr){

        StringBuilder sb = new StringBuilder();
        for(String s : strArr){
            sb.append(s);
            System.out.println(sb.reverse());
            sb.setLength(0);
        }
    }
}
