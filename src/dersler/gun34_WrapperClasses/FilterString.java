package dersler.gun34_WrapperClasses;

public class FilterString {
    public static void main(String[] args) {
        // verilen String icerisinde ki harfleri ayiklayarak anlamali bir metin olusturma
        String str ="(((S&a**_mp24i7y3||/on--= %B%^*9e[s]}i!@$,,<k>**$%t<@£$%a>>>$s@777.||}{";
        System.out.println("filterString(str) = " + filterString(str));
    }
    public static String filterString(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' '){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
