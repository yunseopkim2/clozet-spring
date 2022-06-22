package kr.co.clozet.common.common._bruteForce;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;
/**
 * packageName: kr.co.clozet.common.common._bruteForce
 * fileName   : 팀과제
 * author     : kimyunseop
 * date       : 2022-05-09
 * desc       :"1.팀별 과제 2.팀장이 맡은 과제 3.큐를 담당한 사람 4.팀원별 과제 수");
 *             String[] arr = {"권혜민","조현국","김진영","김한슬","서성민",
 *                     "정렬","해시","힙","완전탐색","DP",
 *                     "스택","깊이우선탐색","그래프","탐욕법","이중탐색",
 *                     "큐","너비우선탐색"
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-09   kimyunseop  최초 생성
 */
public class 팀과제 {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class Solution{
        private String[] team;
        private String res;
        private String subject;
        private String person;
        private int[] intArr;
        private int[] resArr;

        @Override
        public String toString() {
            return "Solution{" +
                    "team=" + Arrays.toString(team) +
                    ", res='" + res + '\'' +
                    ", subject=" + subject +
                    ", intArr=" + Arrays.toString(intArr) +
                    ", resArr=" + Arrays.toString(resArr) +
                    '}';
        }
    }
    @FunctionalInterface interface SolutionService { Solution solution(Solution s);}
    @FunctionalInterface interface SolutionService1 { Solution solution(Solution s);}
    @FunctionalInterface interface SolutionService2 { Solution solution(Solution s);}
    @FunctionalInterface interface SolutionService3 { Solution solution(Solution s);}
    static class Service {
        static SolutionService teamSubject = e -> {
            System.out.println("1.팀별 과제");
            String res = "";
            for (int i = 0; i < e.team.length; i++) {
                if (i % 5 == 1) {
                    res += "\n";
                }
                res += i + ":" + e.team[i] + "\t";
            }

            return Solution.builder().res(res).build();
        };
        static SolutionService1 teamLeaderSubject = e -> {
            System.out.println("2.팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
            String res = "";
            for (int i = 0; i < e.team.length; i++) {
                if (e.team[i].equals(e.person)) {
                    for (int j = 0; j < 3; j++) {
                        res += e.team[i + j * 5] + ",";
                    }
                    if (i == 17) {
                        break;
                    }
                }
            }
            return Solution.builder().res(res).build();
        };
        static SolutionService2 queueManager = e -> {
            System.out.println("3.큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
            /**
             * Q3. 입력한 과목의 인덱스를 추출하세요
             * 5, 10, 15 -> 0
             * 6, 11, 16 -> 1
             * 7, 12, 17 -> 2
             */
            String res = "";
            for (int i = 0; i < e.team.length; i++) {
                if (e.team[i].equals(e.subject)) {
                    res = e.team[i] + "의 담당자는 " + e.team[i % 5];
                }

            }
            return Solution.builder().res(res).build();
        };
        static SolutionService3 subjectCountPerPerson = e -> {
            System.out.println("4.팀원별 과제 수를 출력하세요 "
                    + "예) 권혜민(3개), 조현국(3개), 김진영(2개), 김한슬(2개), 서성민(2개) ");
            String res = "";
            int[] intArr = e.intArr;
            int[] resArr = e.resArr;
            for (int i = 5; i < e.team.length; i++) {
                int a = i % 5;
                for (int j = 0; j < 5; j++) {
                    if (a == j) {
                        intArr[j]++;
                    }
                    resArr = intArr;
                }
            }
            for (int i = 0; i < 5; i++) {
                res = (e.team[i] + "(" + resArr[i] + "), ");
            }
            return Solution.builder().res(res).build();
        };


    }

    @Test
    void testSolution(){
        String[] team = {"권혜민",   "조현국",     "김진영",  "김한슬",  "서성민",
                          "정렬",     "해시",      "힙",   "완전탐색", "DP",
                        "스택",  "깊이우선탐색 ",  "그래프", "탐욕법", "이중탐색",
                         "큐",    "너비우선탐색"   };
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        System.out.println(Service.teamSubject.solution(Solution.builder().team(team).build()));
        System.out.println(Service.teamLeaderSubject.solution(Solution.builder().person("김한슬").team(team).build()));
        System.out.println(Service.queueManager.solution(Solution.builder().subject("힙").team(team).build()));
        Service.subjectCountPerPerson.solution(Solution.builder().intArr(intArr).resArr(resArr).team(team).build());
    }

}
