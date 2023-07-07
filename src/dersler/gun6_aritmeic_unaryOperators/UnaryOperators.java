package dersler.gun6_aritmeic_unaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +10;
        System.out.println("num1 = " + num1);

        int num2 = -100;
        System.out.println("num2 = " + num2);

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        System.out.println("Sum :" + -sum); // -(-90) = +90
        
        boolean b = false;
        System.out.println("b = " + b);
        System.out.println("!b = " + !b); // ! ile False olan degeri True olarak degistiriyor. Sadece Boolean da calisirint
        System.out.println("!!b = " + !!b); // !! iki defa eklenirse basa doner

        int i = 10;
        int j = 5;

        i++; // i = i+1; i yi 1 artirir //post-increment
        j--; // j = j-1; j yi 1 azaltir//post-increment
        System.out.println("i = " + i); //i = 11;
        System.out.println("j = " + j);

        ++i; // i = i+1; i yi 1 artirir // pre-increment
        --j; // j = j-1; j yi 1 azaltir // pre-increment

        System.out.println("i = " + i); // i=12;
        System.out.println("j = " + j); // j=3;
        
        
        int x = 20;
        int y = 30;

        //Degeri bir artirir ve ayni islemde uygular
        System.out.println("++x = " + ++x); // 21
        System.out.println("x = " + x); // 21

        //Degeri bir artirir ve bir sonraki islemde artirilan degeri uygular
        System.out.println("y++ = " + y++); // 30
        System.out.println("y = " + y); // 31

        int k = 10;
        int l = 40;

        System.out.println("a = " + --k); // 9
        System.out.println("k = " + k); // 9
        System.out.println("l-- = " + l--); // 40
        System.out.println("l = " + l); // 39
    }

}
