package kr.co.clozet.common.dataStructure;
import static kr.co.clozet.common.lambda.Lambda.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.clozet.common.dataStructure
 * fileName        : AppleList
 * author           : kimyunseop
 * date               : 2022-05-011
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class AppleList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AppleService service = new AppleServiceImpl();
        while(true) {
            System.out.println("0.Exit 1.save 2.update 3.delete 4.findById 5.findByOrigin 6.findAll 7.count 8.clear");
            switch (s.next()) {
                case "0":
                    break;
                case "1":
                    Apple aa = new Apple.Builder()
                            .origin("영동")
                            .color("RED")
                            .price(1000)
                            .build();
                    service.save(aa);
                    Apple bb = new Apple.Builder()
                            .origin("영동")
                            .color("BLUE")
                            .price(1500)
                            .build();
                    service.save(bb);
                    Apple cc = new Apple.Builder()
                            .origin("풍기")
                            .color("RED")
                            .price(2000)
                            .build();
                    service.save(cc);
                    break;
                case "2":
                    AppleList up = new AppleList();
                    break;
                case "3":
                    Apple temp = new Apple();
                    System.out.println(temp);
                    break;
                case "4":
                    System.out.println("찾을 아이디 입력하세요.");
                    System.out.println(service.findById(s.nextInt()));
                    break;
                case "5":
                    System.out.println(service.findByOrigin("영동"));
                    break;
                case "6":
                    System.out.println(service.findAll());
                    break;
                case "7":
                    System.out.println(service.count());
                    break;
                case "8":
                    service.clear();
                    break;
                case "9":

                    break;
                default:
                    break;
            }
        }
    }
    @Data @NoArgsConstructor
    public static class Apple{
        private String color, origin;
        private int price;

    public Apple(Builder builder){
        this.origin = builder.origin;
        this.color = builder.color;
        this.price = builder.price;
    }
    @NoArgsConstructor
        public static class Builder{
        private String color, origin;
        private int price;

        public Builder origin(String origin){this.origin = origin; return this;}
        public Builder color(String color){this.color = color; return this;}
        public Builder price(int price){this.price = price; return this;}
        public Apple build(){return new Apple(this);}
        }
        @Override
        public String toString(){
            return String.format( "[사과 스펙] origin: %s, color: %s, price: %d",
                    color, origin, price);
        }
    }
    interface AppleService{
        void save(Apple apple);
        void update(Apple apple, int i);
        void delete(Apple apple);
        List<Apple> findAll();
        List<Apple> findByOrigin(String origin);
        List<Apple> findByColor(String color);
        Apple findById(int i);
        int count();
        void clear();
    }
    static class AppleServiceImpl implements AppleService{
        private final List<Apple> list;
        AppleServiceImpl(){

            this.list = new ArrayList<Apple>();

        }
        @Override
        public void save(Apple apple) {
            list.add(apple);
        }

        @Override
        public void delete(Apple apple) {
            list.remove(apple);
        }

        @Override
        public void update(Apple apple, int i) {
            list.set(i, apple);
        }

        @Override
        public Apple findById(int i) {
            return list.get(i);
        }

        @Override
        public List<Apple> findByColor(String color) {
            return list.stream()
                    .filter(apple -> apple.getColor().equals(color))
                    .collect(Collectors.toList());
        }

        @Override
        public List<Apple> findByOrigin(String origin) {

            return list.stream()
                    .filter(apple -> apple.getOrigin().equals(origin))
                    .collect(Collectors.toList());
        }

        @Override
        public List<Apple> findAll() {
            return list;
        }

        @Override
        public int count() {
            return list.size();
        }

        @Override
        public void clear() {
            list.clear();
        }
    }

}
