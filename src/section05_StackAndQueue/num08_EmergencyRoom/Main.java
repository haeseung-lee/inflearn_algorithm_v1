package section05_StackAndQueue.num08_EmergencyRoom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr  = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> que = new LinkedList<>();
        for(int i = 0; i < n; i++){
            que.offer(new Person(i, arr[i]));
        }

        while(!que.isEmpty()){
            Person tmp = que.poll();
            for(Person x : que){
                if(x.priority > tmp.priority){
                    que.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id == m){
                    return answer;
                }
            }
        }
        return answer;
    }
}

class  Person {
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
