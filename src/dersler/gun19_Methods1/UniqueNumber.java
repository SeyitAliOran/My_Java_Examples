package dersler.gun19_Methods1;

public class UniqueNumber {
    public static void main(String[] args) {

        uniqueNumber();

    }
        public static void uniqueNumber(){
            int num1 = 1;
            int num2 = 1;
            int num3 = 1;
            int result = 0;

            if(num1 ==num2 && num1 ==num3){
                result = 1;
            }else if(num1 ==num2 ||num1 ==num3 ||num2 ==num3){
                result =2;
            }else {
                result = 3;
            }
            System.out.println("Count of unique number = " + result);

}
}
