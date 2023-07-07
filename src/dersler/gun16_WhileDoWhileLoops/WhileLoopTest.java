package dersler.gun16_WhileDoWhileLoops;

public class WhileLoopTest {
    public static void main(String[] args) {

        int count = 0;
    while(count < 10){
        // Point A   ---> Always TRUE
        System.out.println("Point A ->" + (count < 100));
        System.out.println(count + ".Welcome java");
       count ++;
       // Point B -->Always TRUE but last iteration is FALSE
        System.out.println("Point B ->" + (count < 10));
        System.out.println("count = " + count);
    }
    // Point C Always FALSE
        System.out.println("Point C ->" + (count < 10));

}
}