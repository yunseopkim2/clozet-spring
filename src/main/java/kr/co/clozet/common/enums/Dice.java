package kr.co.clozet.common.enums;

import lombok.RequiredArgsConstructor;

import java.util.function.BiFunction;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-09
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class Dice {
    @RequiredArgsConstructor
    enum Random{
        ;

        private final String min, max;
        private final BiFunction<Integer, Integer, Integer> f = (min1, max2) -> (int)(Math.random()*max2)+min1;
        @Override
        public String toString() {
            return min+ max;
        }
    }
}
