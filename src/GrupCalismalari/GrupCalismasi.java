package GrupCalismalari;

public class GrupCalismasi {
    public static void main(String[] args) {
        System.out.println(string("havalar cok guzel olsada hayat hala guzel", "ha"));

    }
    public static int string (String str, String arama){
     int counter=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals(arama)){
                counter++;
            }
        }

        return counter;
    }
}
