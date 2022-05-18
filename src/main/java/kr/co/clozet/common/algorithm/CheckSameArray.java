package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

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
public class CheckSameArray {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    static class Solution{
        private int [] arr1;
        private int [] arr2;
    }

    @FunctionalInterface interface CheckSameArrayService{
        Solution solution(Solution solution);
    }

    @Test
    void CheckSameArrayTest(){}
}
