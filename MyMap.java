package andrV2021;

import java.util.Collections;
import java.util.HashMap;


public class MyMap<K, V> extends HashMap<K, V> {
    @Override
    public V get(Object key) {
        V value = super.get(key);
        try{
            if (value == null) {
                value = (V) Collections.emptyList();
        }

        }catch (ClassCastException e) {
            return value;
        }
        return value;
    }
}
