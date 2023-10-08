package ru.geekbrains.lesson4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);

        HashMap<String, String> hashMap = new HashMap<>(4);
        String addResult = hashMap.put("+7900111223300", "AAAAAAA");
        addResult = hashMap.put("+7900111223301", "BBBBBBB");
        addResult = hashMap.put("+7900111223300", "DDDDDDD");
        addResult = hashMap.put("+7900111223302", "EEEEEEE1");
        addResult = hashMap.put("+7900111223303", "EEEEEEE2");
        addResult = hashMap.put("+7900111223304", "EEEEEEE3");
        addResult = hashMap.put("+7900111223305", "EEEEEEE4");
        addResult = hashMap.put("+7900111223306", "EEEEEEE5");
        addResult = hashMap.put("+7900111223307", "EEEEEEE6");
        addResult = hashMap.put("+7900111223308", "EEEEEEE7");
        addResult = hashMap.put("+7900111223309", "EEEEEEE8");
        addResult = hashMap.put("+7900111223310", "EEEEEEE11");
        addResult = hashMap.put("+7900111223311", "EEEEEEE12");
        addResult = hashMap.put("+7900111223312", "EEEEEEE115");

        String searchResult = hashMap.get("+7900111223307");
        System.out.println(hashMap);


// Часть написал, но не получилось пройти в глубину, так как не смог сделать переменную клаcа Node
// Постоянно получал ошибку, что [{
//	"message": "No enclosing instance of type HashMap<K,V>.Bucket<K,V> is accessible. Must qualify the allocation with an enclosing instance of type HashMap<K,V>.Bucket<K,V> (e.g. x.new A() where x is an instance of HashMap<K,V>.Bucket<K,V>).",
// Не проходил до этого ООП, к сожалению...

        for (HashMap.Entity entuty : hashMap) {
            System.out.printf("%s - %s\n", entuty.key, entuty.value);
        }
    }

}
