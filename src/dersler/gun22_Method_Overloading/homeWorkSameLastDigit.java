package dersler.gun22_Method_Overloading;

public class homeWorkSameLastDigit {
    public static void main(String[] args) {
        lastDigit(3,2793);
    }
    public static void lastDigit(int num1,int num2){
       String lastDigit = (num2 %10 ==num1)? (num1+","+num2+ "-> true"):(num1+","+num2+ "-> false");
        System.out.println("lastDigit = " + lastDigit);
    }
}
