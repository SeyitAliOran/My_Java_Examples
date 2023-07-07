package dersler.gun13_ternary_operator;

public class HomeWorkMarks {
    public static void main(String[] args) {
        int note1 = 90;

        String sinifGectiMi = (note1 > 80) ? "Passed" : "Not Passed";
        System.out.println("sinifGectiMi = " + sinifGectiMi);
        if (note1 <45){
            System.out.println("Note = " +note1 +" You failed and you need 5 more points to pass the exam.");
        }
    }
}
