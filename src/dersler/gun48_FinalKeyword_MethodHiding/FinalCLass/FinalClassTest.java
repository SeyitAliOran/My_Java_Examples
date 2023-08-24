package dersler.gun48_FinalKeyword_MethodHiding.FinalCLass;

import dersler.gun48_FinalKeyword_MethodHiding.FinalArrays;

/* FInal class'lar miras alinamaz
 public class FinalClassTest extends FinalClass {
    public void birMethod(){
        super.birMethod();
    }
}

 */
public class FinalClassTest {
    public static void main(String[] args) {
        FinalClass finalClassObj = new FinalClass();
        finalClassObj.birMethod();
    }
}

