package dersler.gun22_Method_Overloading;

public class RecursiveMethod {
    public static void main(String[] args) {

        // Parametre olarak gonderilen bir sayiyi 1 e kadar olan
        // dizi halinde toplamini hesaplayan bir method yaziniz

        System.out.println(addUp(4));
    }

    public static int addUp(int num){
        if(num == 1){
            return 1;
        }
        return num + addUp(num - 1);
    }

}
