package dersler.gun29_StringMethods2;

public class StringStartsWidth {
    // startsWith(----) ---- verdigimiz textin bunun ile baslayip baslamadigini kontrol eder...
    public static void main(String[] args) {
        String str = "Mrs.Brown";
        if (str.startsWith("Mr.")){
            System.out.println("He is a married man");
        }else if(str.startsWith("Mrs.")){
            System.out.println("She is a married woman");
        }else if(str.startsWith("Miss.")){
            System.out.println("She is a not married woman");
        }else if (str.startsWith("Dr.")){
            System.out.println("He/She is a doctor");
        }else {
            System.out.println("Unknown status");
        }
    }
}
