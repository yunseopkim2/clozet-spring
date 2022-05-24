package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
public class Team {

    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    static class Solution{
        private String list;


    }

    @FunctionalInterface private interface TeamService{
        Solution solution(Solution solution);
    }
    static class Service{
        static TeamService teamList = e -> {
            String [] arr;
            return null;
        };
    }

    @Test
    void test(){
        //Service.teamList.solution(Solution.builder().list().build());
    }
}
