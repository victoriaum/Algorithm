package programmers.kit.StackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 스택/큐 - 다리를 지나는 트럭
public class TruckPassDownBridge {
    public static void main(String[] args) {
        // 트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
        // 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭 별 무게 truck_weights가 주어집니다.
        // 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
        // 출처에 자료를 보면 이해가 쉽다

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        // 정답: 8초

        //int bridge_length = 100;
        //int weight = 100;
        //int[] truck_weights = {10};
        // 정답: 101초

        //int bridge_length = 100;
        //int weight = 100;
        //int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        // 정답: 110초


        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    private static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int current_weight = 0;

        for(int i=0; i<truck_weights.length; i++){
            if(current_weight+truck_weights[i] <= weight && queue.size()+1 <= bridge_length){
                queue.add(truck_weights[i]);
                current_weight += truck_weights[i];
            }
            else{
                if(current_weight+truck_weights[i] > weight){

                }
            }
            answer++;
        }

        return answer;
    }
}
