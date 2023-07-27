package dersler.gun18_Branching_Labelled_Statements;

public class PrimeNumberAsalSayi {
    public static void main(String[] args) {
        // Verilen bir sayinin asal sayi olup olmadigini tespit eden bir program yaziniz...

        int number = 1201;
        boolean isPrime = true;

        if(number < 2 ){
            isPrime =false;
        } else {
            for (int i = 2; i <number ; i++) {
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }if (isPrime){
            System.out.println(number + " Asal sayidir");
        }else{
            System.out.println(number + " Asal sayi degildir");
        }


    }
}
