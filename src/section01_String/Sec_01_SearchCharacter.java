package section01_String;

import java.util.Scanner;

public class Sec_01_SearchCharacter {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String origin = in.next();
        char character = in.next().charAt(0);

        int result = solution(origin, character);
        System.out.println(result);
    }
    static int solution(String origin, char character){
        int count = 0;

        origin = origin.toLowerCase();
        character = Character.toLowerCase(character);

        for(char originChar : origin.toCharArray()){
            if(originChar == character){
                count++;
            }
        }
        return count;
    }
}
