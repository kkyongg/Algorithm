package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_20006_랭킹전대기열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int player = Integer.parseInt(st.nextToken()); //플레이어 수
        int maxRoom = Integer.parseInt(st.nextToken()); //방의 정원

        //입력된 순서대로 key 저장 -> LinkedHashMap 사용
        LinkedHashMap<String, Integer> players = new LinkedHashMap<>();

        for (int i = 0; i < player; i++) {
            st = new StringTokenizer(br.readLine());

            int level = Integer.parseInt(st.nextToken());
            String nickname = st.nextToken();

            players.put(nickname, level);
        }

        while (!players.isEmpty()) {
            int count = 0;
            String standardNickname = null;

            List<String> nicknames = new ArrayList<>();

            for (String presentNickname : players.keySet()) {

                //방의 정원이 다 찼으면 for문을 나가서 출력
                if (count == maxRoom) {
                    break;
                }

                //count가 0이면 방의 기준이 되는 레벨을 정해야함
                if (count == 0) {
                    standardNickname = presentNickname;
                    nicknames.add(presentNickname);
                    count++;
                } else {
                    //map.get(value)를 사용해서 방의 기준이 되는 닉네임의 레벨과 현재 닉네임의 레벨을 비교 -> 기준이 되는 레벨의 -10 부터 +10 까지
                    if (players.get(presentNickname) >= players.get(standardNickname) - 10 && players.get(presentNickname) <= players.get(standardNickname) + 10) {
                        nicknames.add(presentNickname);
                        count++;
                    }
                }

            }
            //사전순 정렬
            Collections.sort(nicknames);

            if (nicknames.size() == maxRoom) { //방의 정원이 다 찼으면 출력
                System.out.println("Started!");
            } else { //부족하면 대기
                System.out.println("Waiting!");
            }

            for (int j = 0; j < nicknames.size(); j++) {
                //해당하는 닉네임의 레벨 + 닉네임 출력
                System.out.println(players.get(nicknames.get(j)) + " " + nicknames.get(j));
                //삭제
                players.remove(nicknames.get(j));
            }

        }
    }
}
