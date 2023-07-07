package dersler.gun19_Methods1;

public class Task_OddEvenNumbers {
    public static void main(String[] args) {
        sumofOddNumbers();
        sumOfEvenNumbers();
    }
    public static void sumofOddNumbers(){
        int sumOdd = 0;
        for (int i = 0; i <=10 ; i++) {
            if  (i %2 == 1){
                sumOdd +=i;
            }
        }
        System.out.println("Tek sayilarin toplami = " + sumOdd);

    }
    public static void sumOfEvenNumbers(){
        int sumEven = 0;
        for (int i = 0; i <= 10 ; i++) {
            if(i %2 == 0){
                sumEven += i;
            }

        }
        System.out.println("Cift toplami = " + sumEven);
    }
}
