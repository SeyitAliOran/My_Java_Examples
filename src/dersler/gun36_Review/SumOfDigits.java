package dersler.gun36_Review;

public class SumOfDigits {
    //String icerisinde yer alan rakamlarin toplamini bulan bir program yaziniz
    public static void main(String[] args) {
        String str = "2023AS4534KKJ234";
        System.out.println("sumOfDigit(str) = " + sumOfDigit(str));
    }
    public static int sumOfDigit(String str){
        int total=0;
       char[] ch= str.toCharArray(); // Stringi char array e donderdik

        for (char each:ch) {
            if (Character.isDigit(each)){ // burda her bir karakterin digit olup olmadigini kontrol ediyoruz
                total += Integer.valueOf("" + each); // valueOf un String metodunu kullanip, "" bunu eache ekledik. bu nedenle String ile sayisi topladik
            }
        }
        return total;
    }
}
