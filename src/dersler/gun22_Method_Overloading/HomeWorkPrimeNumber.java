package dersler.gun22_Method_Overloading;

public class HomeWorkPrimeNumber {
    public static void main(String[] args) {
        primeNumber(11);
    }
    public static void primeNumber(int num){
        boolean isPrime = true;

        if(num < 2 ){
            isPrime =false;
        } else {
            for (int i = 2; i <num ; i++) {
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }if (isPrime){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}

