package sgab.model.dao;

/**
 *
 * @author maffort <maffort@gmail.com>
 */
public class BasicPair<K, V> {
    
    private K key;
    private V value;
    
    public BasicPair(K k, V v) {
        key = k;
        value = v;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
    
}
