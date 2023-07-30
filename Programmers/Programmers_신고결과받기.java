package Programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Programmers_신고결과받기 {
    public static void main(String[] args) {

        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k1 = 2;
        System.out.println(Arrays.toString(solution(id_list1, report1, k1)));

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        System.out.println(Arrays.toString(solution(id_list2, report2, k2)));

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reportedIdMap = new HashMap<>(); //[신고된 id, 신고한 id]
        Map<String, Integer> countingMailMap = new HashMap<>(); //[신고된 id, 받을 메일 수]

        //초기세팅
        for (int i = 0; i < id_list.length; i++) {

            reportedIdMap.put(id_list[i], new HashSet<>());
            countingMailMap.put(id_list[i], 0);

        }

        //신고 기록
        for (int i = 0; i < report.length; i++) {

            String[] checkReport = report[i].split(" ");
            String reporter = checkReport[0]; //신고한 id
            String reported = checkReport[1]; //신고된 id

            reportedIdMap.get(reported).add(reporter);

        }

        //신고당한 id가 몇명에게 신고받았는지 - k랑 비교
        for (String reportedId : reportedIdMap.keySet()) {
            HashSet<String> checkMail = reportedIdMap.get(reportedId);

            //신고된 횟수가 k번 이상이면 이용 정지
            if (checkMail.size() >= k) { //이용 정지라면 신고한 id 에게 메일 보내야 함
                for (String reportId : checkMail) {
                    countingMailMap.put(reportId, countingMailMap.get(reportId) + 1);
                }
            }
        }

        for (int i = 0; i < countingMailMap.size(); i++) {
            answer[i] = countingMailMap.get(id_list[i]);
        }

        return answer;
    }
}

