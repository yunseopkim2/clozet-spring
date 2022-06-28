package kr.co.clozet.common.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static kr.co.clozet.common.lambda.Lambda.choi;

/**
 * packageName: kr.co.clozet.common.common._bruteForce
 * fileName   : 소수찾기
 * author     : kimyunseop
 * date       : 2022-05-17
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-17   kimyunseop  최초 생성
 */
public class 소수찾기 {
    @Builder @Getter @AllArgsConstructor
    static class Solution{
        private int a;
        private String res;
        @Override public String toString(){
           return "소수 :" +  res;
        }

    }
    @FunctionalInterface interface SolutionService{ Solution solution(Solution solution);}

    static class Service{
        static SolutionService solutionService = e ->{
            int count = 0;
            String res = "";
            for (int i = 2; i <= e.a; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count == 1) {
                    res += " " + choi(i);
                }
                count = 0;
            }

            return Solution.builder().res(res).build();
        };
    }

    @Test
    void solution(){
        System.out.println(Service.solutionService.solution(Solution.builder().a(100).build()));
    }
}
