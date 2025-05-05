package section01_String;

import java.util.Scanner;

public class Sec_01_SearchCharacter {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String origin = in.nextLine();
        char character = in.nextLine().charAt(0);

        int result = solution(origin, character);
        System.out.println(result);
    }
    static int solution(String origin, char character){
        int count = 0;

        for(char originChar : origin.toCharArray()){
            if(Character.toLowerCase(originChar) == Character.toLowerCase(character)){
                count++;
            }
        }
        return count;
    }
}
