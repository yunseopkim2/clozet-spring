package kr.co.clozet.common.lambda;
import static kr.co.clozet.common.dataStructure.AppleList.Apple;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * packageName:kr.co.clozet.common.lambda
 * fileName        : Lambda
 * author           : kimyunseop
 * date               : 2022-05-11
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class Lambda{
    public static void main(String[] args) {

        System.out.println(integer("900"));
        System.out.println(string(900));
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(string(Arrays.asList(
                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
                                new Apple.Builder().origin("풍기").color("BLUE").price(3000).build()
                ))
            );
        System.out.println(equals("녕", "안"));
        System.out.println(array(10));
    }
    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);

    }
    public static String string(Object o){
        Function<Object, String> f = String::valueOf;
        return f.apply(o);
        // String s = String.valueOf(Object);

    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1, s2);

    }
    //int [] arr = new int[8];
    // = int[]::new
    public static int[] array(int arr){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(arr);
    }
}
