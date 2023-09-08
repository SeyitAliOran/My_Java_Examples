package dersler.gun59_CollectionQueueSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopIterator {
    // Herhangi bir siralamaya gore yapilmiyor
    // tekrar eden nesneler eklenmez
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(20);
        nums.add(30);
        nums.add(80);
        nums.add(50);
        nums.add(110);
        nums.add(90);
        nums.add(1200);
        nums.add(1190);
        nums.add(20);
        nums.add(10);
        nums.add(70);
        System.out.println("nums = " + nums);
        for (Integer num:nums){
            System.out.print(num + " | ");
        }
        System.out.println();
        System.out.println("////////////////");
        Iterator<Integer> it1 = nums.iterator(); //  nums.iterator() ile objecti create ediyoruz
        System.out.println("it1.hasNext() = " + it1.hasNext());// bir sonraki objectin olup olmadigini donderir
        System.out.println("it1.next() = " + it1.next()); // 80 --> bir sonraki objecti veriyor.
        System.out.println("it1.next() = " + it1.next()); // 1200 -->
        System.out.println();

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){ // son object false olana kadar dongu devam eder
            System.out.print(it.next() + " | ");
        }
        System.out.println();

       /*
        // For each loop ile bi condition icerisin remove() methodunu uygulayamiyoruz
        // hata veriyor --> ConcurrentModificationException
        for (Integer num : nums){
            if (num > 100){
                nums.remove(num);
            }
            System.out.println(num);
        }
         */
        Iterator<Integer> iterator = nums.iterator();

        // Iterator ile Foreach arasinda ki fark listeden bject cikartmak. For each ile hata aliriz
        // while dongusu ile 1000 in uzerindeki sayilari listeden cikarttik
        while (iterator.hasNext()){ //  iterator.hasNext() boze boolean TRUE donderir. False olana kadar devam eder.
            int value = iterator.next(); // ilk objecti alip value e assign ettik
            if (value > 1000){
                iterator.remove();
            }
        }
        System.out.println("nums = " + nums); //  [80, 50, 20, 70, 90, 10, 30, 110]

    }
}
