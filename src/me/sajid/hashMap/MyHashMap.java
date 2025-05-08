package me.sajid.hashMap;

import java.util.Arrays;

public class MyHashMap<K, V> {
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    Node<K, V>[] adjacencyList;
    // always want size to be in power of 2
    private static int INITIAL_SIZE = 16;
    private static int MAX_SIZE = 1 << 30;
    private int size;
    public MyHashMap(int size) {
        this.size = Math.max(roundOffSize(size), INITIAL_SIZE);
        adjacencyList = new Node[this.size];
    }

    private final int roundOffSize(int size) {
        int n = size-1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n < 0 ? 1 : n > MAX_SIZE ? MAX_SIZE : n+1;
    }

    public void put(K key, V value) {
        int idx = key.hashCode() % size;
        Node<K, V> node = adjacencyList[idx];
        if(node == null) {
            adjacencyList[idx] = new Node<K, V>(key, value);
        } else {
            while(node.next != null && !node.key.equals(key)) {
                node = node.next;
            }
            if(node.key.equals(key)) {
                node.value = value;
            } else if(node.next == null) {
                node.next = new Node<K, V>(key, value);
            }
        }
        System.out.println("Put done");
    }

    public V get(K key) {
        int idx = key.hashCode() % size;
        Node<K, V> node = adjacencyList[idx];
        while(node.next != null && !node.key.equals(key))
            node = node.next;
        if(node.key.equals(key))
            return node.value;
        return null;
    }
}
