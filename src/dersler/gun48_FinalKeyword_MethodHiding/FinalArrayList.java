package dersler.gun48_FinalKeyword_MethodHiding;

import java.util.ArrayList;

public class FinalArrayList {
    public static void main(String[] args) {
        FinalArrayList finalArrayList =new FinalArrayList();
        finalArrayList.arrayList.add(12);
        finalArrayList.arrayList.add(122);
        finalArrayList.arrayList.add(123);
        finalArrayList.arrayList.add(124);
        for (Integer sayi: finalArrayList.arrayList){
            System.out.println("sayi = " + sayi);
        }
        ArrayList<Integer> birArrayList = new ArrayList<>();
        // finalArrayList.arrayList = birArrayList; final olarak tanimlanmis Array liste baska bir Arraylist assign edilemez..

    }
    final ArrayList<Integer> arrayList = new ArrayList<>();

}
