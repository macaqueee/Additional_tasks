package hashMap.hashMap;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

/**
 * Created by macaque on 10.08.2016.
 */
public class HashMap<K,V> implements Map<K,V> {

    private static final int DEFAULT_TABLE_SIZE = 15;
    private static final int SIZE_REFACTOR = 2;
    private Node[] table;
    private static int size;
    private static final double LOAD_FACTOR = 0.75;

    public HashMap() {
        this.table = (Node[]) Array.newInstance(Node.class, DEFAULT_TABLE_SIZE);
    }

    @Override
    public int size() {
        return size;
    }

    public int tableLength(){
        return table.length;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {

        if(key == null){
            return false;
        }
        int position = getPosition(key, table.length);
        if(table[position] == null){
            return false;
        } else {
            for (Node iter = table[position]; iter != null ; iter = iter.next) {
                if (iter.key.equals(key)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {

        for (Node node : table) {
            while(node != null){
                if(node.value.equals(value)){
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    private int getPosition(Object key, int length) {
        int hash = Math.abs(key.hashCode());
        return hash % length;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {


        int position = getPosition(key, table.length);

        if(key == null){
            return null;
        }

        // check is position for new object free
        if(table[position] == null){
            table[position] = new Node(key,value,null);
            size++;
            chechRehashing();
            return null;
        }

        // for better readability
        K oldKey = table[position].key;
        V oldValue = table[position].value;
        Node oldNode = table[position];

        // If keys is the same, but values are different
        if(oldKey.equals(key) && !oldValue.equals(value)){
            table[position] = new Node(key,value,oldNode.next);
            return oldValue;
        }

        //If new key coming
        if(!oldKey.equals(key)) {
            table[position] = new Node(key,value,oldNode);
            size++;
            chechRehashing();
            return oldValue;
        }

        return null;
    }

    public void chechRehashing(){
        if ((size+1)/table.length > LOAD_FACTOR){
            resize(SIZE_REFACTOR * table.length);
        }
    }

    public void resize(int newSize){
        Node[] newTable = (Node[]) Array.newInstance(Node.class, newSize);
        for (int j = 0; j < table.length; j++) {
            Node e = table[j];
            if (e != null) {
                table[j] = null;
                do {
                    Node next = e.next;
                    int i = getPosition(e.key,newSize);
                    e.next = newTable[i];
                    newTable[i] = e;
                    e = next;
                } while (e != null);
            }
        }
        table = newTable;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private class Node {
        K key;
        V value;
        Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

}
