package CodingBath;

public class GirilenKelimeyiKesipEkleme {
    public static void main(String[] args) {
        System.out.println("girilenKelimeyiKesipEkleme(\"Java\") = " + girilenKelimeyiKesipEkleme("Java"));
    }
    public static String girilenKelimeyiKesipEkleme (String str){
        String newStr = "";
        if (str.length() >= 3) {
            newStr = str.substring(0, 3);
        }else{
            newStr= str;
        }
        return newStr+newStr+newStr;
    }
}

