package dersler.gun39_Encapsulation_1.EncapsulationExample;

public class TestSimpleGetterAndSetter {
    public static void main(String[] args) {
        SimpleGetterAndSetter obj1 = new SimpleGetterAndSetter();
        SimpleGetterAndSetter obj2 = new SimpleGetterAndSetter(-15,68);
      //  obj1.number = 15;// error number is private access
      //  obj1.result = 25;// error result is private access
        obj1.setNumber2(15);
        System.out.println("obj1.getNumber2() = " + obj1.getNumber2());
        System.out.println("obj2.getNumber() = " + obj2.getNumber());
        System.out.println("obj2.getResult() = " + obj2.getResult());
        obj2.setNumber(-255);
        System.out.println("obj2.getNumber() = " + obj2.getNumber());


    }
}
