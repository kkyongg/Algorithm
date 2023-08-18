package Programmers;

public class Programmers_스킬트리 {
    public static void main(String[] args) {

        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));

    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            //skill 문자 제외하고 나머지 문자들을 ""로 치환
            String checkSkill = skill_trees[i].replaceAll("[^" + skill + "]", "");
            //checkSkill 길이만틈 잘라서 확인
            String resultSkill = skill.substring(0, checkSkill.length());

            if (checkSkill.equals(resultSkill)) {
                answer++;
            }
        }
        return answer;
    }
}
