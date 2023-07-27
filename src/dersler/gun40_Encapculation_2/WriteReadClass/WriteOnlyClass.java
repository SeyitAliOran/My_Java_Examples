package dersler.gun40_Encapculation_2.WriteReadClass;

public class WriteOnlyClass {
    // Write Only Class bize degiskenlerin degerlerini degistirmemizi saglar fakak getter metodu
    // olmadigi icin set ettigimiz degeri okuyamayiz
    private int value1;
    private int value2;

    public WriteOnlyClass(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
