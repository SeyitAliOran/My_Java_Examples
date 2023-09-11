package dersler.gun60_Maps;

import java.util.*;

public class MapValueTypes {
    public static void main(String[] args) {
        // key kismi herzaman tek olmak zorunda ama value kisminda bir sinirlama yok
        // Map<List<String>, String> map6 = new HashMap<>();
        // <Key, Object> value degerini object ile mapleyebiliyoruz

        Map<Integer,String > map1 = new HashMap<>();
        map1.put(1, "john");
        map1.put(2, "jone");
        map1.put(3, "jim");
        System.out.println("map1 = " + map1);
        System.out.println();

        // <Key, Array> --->value degerini Array ile mapleyebiliyoruz
        Map<String,String[]> map2 = new HashMap<>();
        String[] arr1 ={"john","jane"};
        String[] arr2 ={"jim","bob"};
        map2.put("Family1", arr1);
        map2.put("Family2", arr2);
        System.out.println("map2 = " + map2);
        System.out.println();

        // <Key, Collection> value degerini Collection ile mapleyebiliyoruz
        Map<Integer, List<String>> map3 = new HashMap<>();
        List<String> list1 = Arrays.asList("john","jane");
        List<String> list2 = Arrays.asList("jim","bob");
        map3.put(1,list1);
        map3.put(2,list2);
        System.out.println("map3 = " + map3);
        System.out.println();

        // <Key, Map>value degerini Map ile mapleyebiliyoruz
        Map<String,Map<Integer,String>> map4 = new HashMap<>();
        Map<Integer,String> friends1 = new HashMap<>();
        friends1.put(1,"John");
        friends1.put(2,"jane");
        Map<Integer,String> friends2 = new HashMap<>();
        friends2.put(1,"Jim");
        friends2.put(2,"bob");

        map4.put("A",friends1);
        map4.put("B",friends2);
        System.out.println("map4 = " + map4);
        System.out.println();
        // <Key, Custom Class Object> value degerini Custom Class Object ile mapleyebiliyoruz
        Map<String,Animal> map5 = new HashMap<>();
        Animal dog = new Animal("dog",5);
        Animal cat = new Animal("cat",2);
        map5.put("animal1",dog);
        map5.put("animal2",cat);
        System.out.println("map5 = " + map5);


    }
}
class Animal{
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
