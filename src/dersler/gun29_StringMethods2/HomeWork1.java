package dersler.gun29_StringMethods2;

public class HomeWork1 {
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDuplicated("DDEECGDDEEEEFGGDCDD") ==> DECGF
    public static void main(String[] args) {
        String word = "DDEECGDDEEEEFGGDCDD";
        System.out.println("Old Word is: " + word);
        System.out.println("New Word is : " + removeDublicatedChar(word));

    }
    public static String removeDublicatedChar(String word) {
        String newStr = "";
        for (int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if (newStr.indexOf(ch) == -1)
            {
                newStr += ch;

            }
        }
        return newStr;
    }
}
