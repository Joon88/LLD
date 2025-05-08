package me.sajid.hashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map = new MyHashMap<>(1);
        map.put(1, 5);
        map.put(2, 15);
        map.put(6, 65);
        map.put(2, 45);
        map.put(7, 54);
        System.out.println(map.get(7));
    }
}
