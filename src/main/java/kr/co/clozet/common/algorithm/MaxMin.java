package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

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
public class MaxMin {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    static class MaxMinCk{
        private int data1, data2, data3, data4, data5;

        @Override
        public String toString() {

            return "number{" +
                    "data1=" + data1 +
                    ", data2=" + data2 +
                    ", data3=" + data3 +
                    ", data4=" + data4 +
                    ", data5=" + data5 +
                    '}';
        }
    }
    interface MaxMinService{
        List<Integer> getMin(List<Integer> maxMinCks);
        List<Integer> getMax(List<Integer> maxMinCks);

    }

    static class MaxMinServiceImpl implements MaxMinService{

        @Override
        public List<Integer> getMin(List<Integer> maxMinCks) {
            int min = Integer.MIN_VALUE;
            System.out.println(min);


            return null;
        }

        @Override
        public List<Integer> getMax(List<Integer> maxMinCks) {
            return null;
        }
    }
    @Test
    void MaxMinTest(){
        MaxMinCk.builder().data1(3).data2(1).data3(9).data4(5).data5(10).build();
    }



}
