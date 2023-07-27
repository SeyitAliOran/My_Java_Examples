package CodingBath;

public class intMax3Numbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        System.out.println(intMax(a, b, c));
    }
    public static int intMax(int a, int b, int c){
       /* int maxNumber;
        int maxNumber1;
       maxNumber= Math.max(a,b);
       if (maxNumber > c){
           maxNumber1 = maxNumber;
       }else {
          maxNumber1 = c;
       }
        return maxNumber1;

        */
        int max;
        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Now check between max and c
        if (c > max) {
            max = c;
        }

        return max;

        // Could use the built in Math.max(x, y) function which selects the larger
        // of two values.
    }
}
