package kr.co.clozet.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName: kr.co.clozet.common.dataStructure
 * fileName        : Thunk
 * author           : kimyunseop
 * date               : 2022-05-12
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
@Component @Data @Lazy
public class Thunk<K, V>{
    private final Map<K, V> map;
    public Thunk(){
        this.map = new HashMap<>();
    }

    public void put(K k, V v){
        map.put(k, v);
    }
    public void replace(K k, V v){
        map.replace(k, v);
    }
    public void remove(K k, V v){
        map.remove(k, v);
    }
    public V get(K k){
        return map.get(k);
    }
    public int size(){
        return map.size();
    }
    public boolean containsKey(K k){
        return map.containsKey(k);
    }
    public List<V> values(){
        return new ArrayList<>(map.values());
    }

    public void clear(){
        map.clear();
    }

}
