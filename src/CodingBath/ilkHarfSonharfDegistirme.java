package CodingBath;
/*

Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class ilkHarfSonharfDegistirme {
    public static void main(String[] args) {
        System.out.println("sonHarfiBasaYazma = " + sonHarfiBasaYazma("ali"));
    }
    public static String sonHarfiBasaYazma(String str){
        if(str.length() <= 1){
            return str;
        }
        String orta = str.substring(1,str.length()-1);
        return  str.charAt(str.length()-1) + orta + str.charAt(0);
    }
}
