package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-18
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class Fruits {

    @Builder @AllArgsConstructor @NoArgsConstructor @Getter
        static class Solution {
        private int apple, grape, orange, total;

        @Override
        public String toString() {
            return String.format(" apple : %d, grape: %d, orange: %d, total: %d",
                                apple, grape, orange, total);
        }
    }

    @FunctionalInterface
        private interface FruitsService{
            Solution solution(Solution solution);
        }
        @Test
    void FruitsTest(){
            FruitsService f = e ->{
                int apple = 0;
                int grave = 0;
                int orange = 0;
                return Solution.builder().apple(apple).grape(grave).orange(orange).build();
            };


          //  f.solution(Solution.builder().apple().grape().orange().total().build());

}}
