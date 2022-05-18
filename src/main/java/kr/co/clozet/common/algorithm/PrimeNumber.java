package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class PrimeNumber {
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    private static class Solution {
        int start, end;
        List<Solution> primes;

        @Override
        public String toString() {
            return String.format("시작값 : %d 끝값 : %d 중간값: %s", start,end, primes);
        }
    }

    @FunctionalInterface private interface SolutionService{
        Solution soltion(Solution solution);
    }

    @Test
    void testSoltion(){
        int [] primes = {};
        SolutionService sol = x ->{
            int count = 0;
            for(int i = x.getStart(); i < x.getEnd(); i++){
                boolean check = true;
                for(int j =2; j<=i; j++){
                    if(i%j==0){
                        check = false;

                    }
                    else {
                        //x.getPrimes().add(i);
                    }

                }

            }
            return Solution.builder().start(1).end(100).build();
        } ;

        System.out.println(sol.soltion(Solution.builder().primes(new ArrayList<>()).build()));

    }

}
