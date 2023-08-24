package dersler.gun48_FinalKeyword_MethodHiding;

import java.util.Arrays;

public class FinalArrays {
    public static void main(String[] args) {
        FinalArrays finalArrays = new FinalArrays();
        finalArrays.numbers[0]  =1;
        finalArrays.numbers[1]  =2;
        finalArrays.numbers[2]  =3;
        for (int number: finalArrays.numbers){
            System.out.println("number: "+number);
        }
        finalArrays.finalNumbers[0] = 3;
        finalArrays.finalNumbers[1] = 4;
        finalArrays.finalNumbers[2] = 5;
        System.out.println("Arrays.toString(finalArrays.finalNumbers) = " + Arrays.toString(finalArrays.finalNumbers));

        int[] birArray = new int[3];
        finalArrays.numbers = birArray;
        System.out.println("Arrays.toString(finalArrays.numbers) = " + Arrays.toString(finalArrays.numbers));
       // finalArrays.finalNumbers = birArray; final olarak tanimlanmis Array'e baska bir Array assign edilemez..
    }
    int[] numbers = new int[3];
    final int[] finalNumbers = new int[3];



}
