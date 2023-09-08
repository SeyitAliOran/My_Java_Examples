package dersler.gun56_ErrorExeptionHandling1.Errors;

public class OutOfMemory {
    public static void main(String[] args) {
        int[] buyukBirDizi = new int[1000_000_000]; // Error ---> OutOfMemory ___ Java hafiza doluluk hatasi
        System.out.println(buyukBirDizi.length);

        byte[] buyukBirDizi1 = new byte[50_000_000]; // Error ---> OutOfMemory ___ Java hafiza doluluk hatasi
        System.out.println(buyukBirDizi1.length);

        int[] dizi = new int[Integer.MAX_VALUE]; // Error ---> OutOfMemory ___ Java hafiza doluluk hatasi
        System.out.println(dizi.length);
        ///////////////////////////////////////////////

        try {
            int[] diziInt = new int[Integer.MAX_VALUE];// this line of code may cause an error
        }catch (OutOfMemoryError hata){ //Catching the error
            System.err.println("Maximum büyüklükte int dizi tanımlaması hafıza sınırları aşıldığından yapamadım.");
        }



    }

}
