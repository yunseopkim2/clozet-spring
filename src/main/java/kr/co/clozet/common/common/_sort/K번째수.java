package kr.co.clozet.common.common._sort;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

/**
 * packageName: kr.co.clozet.common.common._sort
 * fileName   : K번째수
 * author     : kimyunseop
 * date       : 2022-05-24
 * desc       :
 * * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * *
 * * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * *
 * * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * * 2에서 나온 배열의 3번째 숫자는 5입니다.
 * * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * *
 * * 제한사항
 * * array의 길이는 1 이상 100 이하입니다.
 * * array의 각 원소는 1 이상 100 이하입니다.
 * * commands의 길이는 1 이상 50 이하입니다.
 * * commands의 각 원소는 길이가 3입니다.
 * * 입출력 예
 * * array    commands   return
 * * [1, 5, 2, 6, 3, 7, 4]    [[2, 5, 3], [4, 4, 1], [1, 7, 3]]  [5, 6, 3]
 * * 입출력 예 설명
 * * [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
 * * [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
 * * [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-24   kimyunseop  최초 생성
 */
public class K번째수 {

    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    public static class Solution{
        private int[] arr;
        private int []start;
        private int end;
        private int [][] res;

        @Override
        public String toString() {
            return "Solution{" +
                    "arr=" + Arrays.toString(arr) +
                    ", start=" + start +
                    ", end=" + end +
                    ", res=" + Arrays.toString(res) +
                    '}';
        }
    }

    @FunctionalInterface
    public interface SolutionService {
        Solution solution(Solution s);
    }

    @Test
    void testSolution(){
        int [] arr = {1, 5, 2, 6, 3, 7, 4};
        SolutionService solution = e ->{
            int end = 0;
        for(int i : e.getArr()){
            if(i < end) end = i;
            Arrays.sort(arr);
        }
        return Solution.builder().end(end).arr(arr).build();
    };

        System.out.println(solution.solution(Solution.builder().arr(arr).build()));
    }




}