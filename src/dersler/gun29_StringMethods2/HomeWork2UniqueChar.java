package dersler.gun29_StringMethods2;

  public class HomeWork2UniqueChar {
    //Write a return method that can find the unique characters from the String
    //Ex: uniqueChar("DDEECGDDEEEEFGGDCDDM") ==> "FM";
    public static void main(String[] args) {
        String word = "DDEECGDDEEEEFGGDCDDM";
        System.out.println("uniqueChar(word) = " + uniqueChar(word));


    }
      public static String uniqueChar(String str){
          String result = "";
          int counter = 0;
          for (int i = 0; i < str.length(); i++) {
              for (int j = 0; j < str.length(); j++) {
                  if (str.charAt(i) == str.charAt(j)){
                      counter++;
                  }
              }
              if (counter == 1){
                  result +=str.charAt(i);
              }
              counter =0;
          }
          return result;
      }

}