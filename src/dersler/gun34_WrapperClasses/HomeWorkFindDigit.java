package dersler.gun34_WrapperClasses;
/*
Write a method that can recognise numbers in following Strings and print them as digits
String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$”;
String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
Ex: updateToDigits(String s)
Returns:
- 1 2 5 6
- 9 3 4
 */
public class HomeWorkFindDigit {
    public static void main(String[] args) {
        String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        System.out.println(findDigit(str1));
    }
    public static String findDigit(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(i)) {
                newStr += i ;
            }
        }


        return newStr;
    }
}
