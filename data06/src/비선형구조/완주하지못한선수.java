package 비선형구조;

import java.util.HashMap;

public class 완주하지못한선수 {

    public static void main(String[] args) {

        Solution6 s = new Solution6();
        String[] all = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};
        String result = s.solution(all, com);
        System.out.println(result);
    }
}

class Solution6 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 참가자 명단을 HashMap에 넣고, 동명이인이 있다면 value를 증가시킵니다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        // 완주자 명단을 HashMap에서 빼면서 value를 감소시킵니다.
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        // value가 0보다 큰 경우가 완주하지 못한 선수입니다.
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
