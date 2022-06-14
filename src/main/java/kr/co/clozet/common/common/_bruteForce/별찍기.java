package kr.co.clozet.common.common._bruteForce;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static kr.co.clozet.common.lambda.Lambda.countStar;

/**
 * packageName: kr.co.clozet.common.common._bruteForce
 * fileName   : 별찍기
 * author     : kimyunseop
 * date       : 2022-05-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-25   kimyunseop  최초 생성
 */
public class 별찍기 {
    @Getter @Builder
    @AllArgsConstructor @NoArgsConstructor
    static class Solution{
        private String star;
        private int random;
        @Override public String toString(){
           return star;
        }}
    @FunctionalInterface interface SolutionService { Solution solution(Solution s);}
    @FunctionalInterface interface SolutionService1 { Solution solution(Solution s);}
        static class Service{
            static SolutionService triangleStarPrint = e -> {

                // triangleStarPrint
                String res = "";
                int rand = e.random;
                System.out.println("정삼각형 별찍기");
                System.out.println("정삼각형의 길이 랜덤으로 생성한 값 : " + rand);
                for (int i = 0; i < rand; i++) {
                    for (int j = rand - i; j >= 0; j--) {
                        res += String.format(" ");
                    }
                    for (int k = 1; k < i * 2; k++) {
                        res += String.format("*");
                    }
                    res += String.format("\n");
                }
                return Solution.builder().star(res).build();
            };
            static SolutionService1 rectangleStarPrint = e ->{
                // rectangleStarPrint
                String res = "";
                int rand = e.random;
                System.out.println("좌측90도 직각삼각형 별찍기");
                System.out.println("삼각형의 길이 랜덤으로 생성한 값 : " + rand);
                for (int i = 0; i < rand; i++) {
                    for (int j = 0; j <= i; j++) {
                        res += String.format("*");
                    }
                    res += String.format("\n");
                }
                return Solution.builder().star(res).build();
            };
        }


    @Test
    void testSolution(){
        System.out.println(Service.triangleStarPrint.solution(Solution.builder().random(countStar()).build()));
        System.out.println(Service.rectangleStarPrint.solution(Solution.builder().random(countStar()).build()));
    }
}
