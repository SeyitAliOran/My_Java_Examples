package dersler.gun32_Review;

public class FindingOccurrenceOfChar {
    public static void main(String[] args) {
        String str = "Ahmet okula gidiyor";
        System.out.println("findNumberOccurrence(str,'o') = " + findNumberOccurrence(str, 'o'));
    }
    public static int findNumberOccurrence(String str, char harf) { // harflerin kacar defa tekrarladigini bulan method
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == harf) {
                counter++;
            }
        }
        return counter;
    }
}
