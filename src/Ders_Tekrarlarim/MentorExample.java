package Ders_Tekrarlarim;

import java.util.Locale;

public class MentorExample {
    /*write a program to print true if the string "cat" and "dog" appear the
same number of times in the given sentence
        Ex:
            sentence = "caT dog dogG cAt"
            output: true
 */
    public static void main(String[] args) {
        String str = "caT dog dogG cAt"; //Initialize the input sentence

        // "dog" ve "cat" kelimesinin sayısını tutacak değişkenleri başlatın
        //Initialize two variables to count the occurrences of "dog" and "cat":
        int countDog = 0;
        int countCat = 0;

        // 3 karakterlik alt dizileri oluşturmak için bir for döngüsü kullanın
        //Use a for loop to iterate through the string, looking for substrings of length 3:
        for (int i = 0; i <= str.length() - 3; i++) {
            // Alt diziyi oluşturun
            String s = str.substring(i, i + 3);

            // Alt dizi "dog" kelimesiyle eşleşiyorsa, countDog değişkenini artırın
            if (s.equalsIgnoreCase("dog")) {
                countDog++;
            }

            // Alt dizi "cat" kelimesiyle eşleşiyorsa, countCat değişkenini artırın
            if (s.equalsIgnoreCase("cat")) {
                countCat++;
            }
        }

        // "dog" ve "cat" kelimesinin sayısını karşılaştırın ve sonucu yazdırın
        boolean result = countCat == countDog;
        System.out.println(result);

    }
}
