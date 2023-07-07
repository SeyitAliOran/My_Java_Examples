package dersler.gun22_Method_Overloading;

public class AlanHesaplama {

    public static void main(String[] args) {
        // Kare,dikdortgen, ucgen ve dairenin alanini hesaplama

        int squareArea = calculateArea(5);// karenin alani
        System.out.println("squareArea = " + squareArea);

        int rectangleArea = calculateArea(4,5);  // dikdortgenin alani
        System.out.println("rectangleArea = " + rectangleArea);

        int triangleArea = calculateArea(3,4,5); // ucgenin alani
        System.out.println("triangleArea = " + triangleArea);

        double circleArea = calculateArea(8.0); // dairenin alani
        System.out.println("circleArea = " + circleArea);


    }

    public static int calculateArea(int sideLength) { // karenin alani
        return sideLength*sideLength;
    }
    public static int calculateArea(int length,int width) { // dikdortgenin alani
        return length*width;
    }
    public static int calculateArea (int side1,int side2,int side3){ // ucgenin alani
            return (side1*side2) / 2;
    }
    public static double calculateArea (double radius){ // dairenin alani
        return 3.14* (radius*radius);
    }
}
