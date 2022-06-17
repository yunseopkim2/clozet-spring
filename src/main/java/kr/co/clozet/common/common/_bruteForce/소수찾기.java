package kr.co.clozet.common.common._bruteForce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

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

        @Override public String toString(){
           return null;
        }

    }
    @FunctionalInterface interface SolutionService{ Solution solution(Solution solution);}

    static class Service{
        static SolutionService solutionService = e ->{
            int a = 0;
            int count = 0;

            for (int i = 2; i <= e.a; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.print(i + " ");
                }
                count = 0;
            }

            return null;
        };
    }

    @Test
    void solution(){
        System.out.println(Service.solutionService.solution(Solution.builder().a(100).build()));
    }
}
