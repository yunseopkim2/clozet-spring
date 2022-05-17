package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-17
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class MinMax {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution{
        private int [] arr;
        private int max, min;

        @Override
        public String toString() {
            return String.format("최소값 : %d 최대값 : %d ", min, max);
        }
    }

    @FunctionalInterface private interface SolutionServicer{
         Solution solution(Solution s);
    }

    @Test
    void testSolution(){
        int[] arr = {3, 1, 9, 5, 10, 22};
        SolutionServicer f = e ->{
            int max = 0;
            int min = 10;
            for(int i : e.getArr()){
                if(i < min) min = i;
            }
            for(int i : e.getArr()){
                if(i > max) max = i;
            }
            return Solution.builder().min(min).max(max).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));

    }
}
