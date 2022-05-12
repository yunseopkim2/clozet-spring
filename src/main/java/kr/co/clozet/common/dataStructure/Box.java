package kr.co.clozet.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
@Component @Data @Lazy
public class Box<T> {
    private ArrayList<T> list;
    public Box() { this.list = new ArrayList<>();}


    public void add(T t){
            list.add(t);
        }
    public void set(T t, int i){
            list.set(i, t);
        }

    public void remove(T t){
            list.remove(t);
        }
        public T get(int i){
            return list.get(i);
        }
    public List<T> get(){
            return list;
        }
        public int size(){
            return list.size();
        }

    public void clear(){
            list.clear();
        }



}
