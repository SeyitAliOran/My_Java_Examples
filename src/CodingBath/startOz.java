package CodingBath;

public class startOz {
    /*
    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second
    only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */
    public static void main(String[] args) {
        String str = "";
        System.out.println(startOz(str));
    }
    public static String startOz(String str) {
        String newStr = "";
        if (!str.isEmpty()) {
            if (str.startsWith("oz")) {
                newStr = "oz";
            } else if (str.substring(0, 1).equals("o")) {
                newStr = "o";
            } else if (str.substring(1, 2).equals("z")) {
                newStr = "z";
            }
        }

        return newStr;
    }
}
