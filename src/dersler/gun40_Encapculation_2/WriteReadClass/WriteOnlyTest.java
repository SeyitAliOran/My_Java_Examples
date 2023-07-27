package dersler.gun40_Encapculation_2.WriteReadClass;

public class WriteOnlyTest {
    public static void main(String[] args) {
        WriteOnlyClass writeOnlyClass = new WriteOnlyClass(12,13);
        writeOnlyClass.setValue1(12);
        writeOnlyClass.setValue2(14);
    }
}
