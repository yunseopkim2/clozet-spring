package kr.co.clozet.common.lambda;
import org.hibernate.dialect.Ingres9Dialect;

import static kr.co.clozet.common.dataStructure.AppleList.Apple;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.function.*;

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
        System.out.println(array(9).length);
        System.out.println("랜덤 주사위: "+Math.round(dice()));
        System.out.println("범위 내에 랜덤값:"+ random2(1,6));
        System.out.println(random(1,9));
        System.out.println(date());
        System.out.println(date1());
        System.out.println(date3());

    }
    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);

    }
    public static String date(){
       // Supplier<Object> f = LocalDate::now;
        Supplier<String> f = () -> string(LocalDate.now());
        return f.get();
    }
    public static String date1(){
        Supplier<Date> f = Date::new;
        return String.valueOf(f.get());
    }
    public static Object date2(){
        Supplier<Object> f = LocalDate::now;
        return String.valueOf(f.get());
    }
    public static String date3(){
        Supplier<String> f = () -> new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        return f.get();
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
    public static long longParse(String s){
        Function<String, Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float::parseFloat;
        return f.apply(s);
    }
    public static int[] array(int arr){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(arr);
    }
    public static double dice(){
        Supplier<Double> s = Math::random;
        return (s.get() * 6) +1;
    }
    public static int Atm(){
        //BiFunction<Integer, Integer, Double> s = Math::random;
        Supplier<Double> s = Math::random;
        return (int)(s.get()*1001)+1;
    }
    public static int lotto(){
        //BiFunction<Integer, Integer, Double> s = Math::random;
        Supplier<Double> s = Math::random;
        return (int)(s.get()*45)+1;
    }

    public static int random2(int min, int max){
        //BiFunction<Integer, Integer, Double> s = Math::random;
        Supplier<Double> s = Math::random;
        return (int)(s.get()*max)+min;
    }
    public static int random(int min, int max){
        BiFunction<Integer, Integer, Integer> f = (min1, max2) -> (int)(Math.random()*max2)+min1;
        return f.apply(min, max);
    }

    public static String choi(int i){
    Function<Integer, String> f = String::valueOf;
    return f.apply(i);
    }
    public static File makeFile(String file){
        Function<String, File> f = File::new;
        return f.apply(file);
    }
}
