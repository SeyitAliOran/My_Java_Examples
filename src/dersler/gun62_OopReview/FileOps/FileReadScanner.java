package dersler.gun62_OopReview.FileOps;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadScanner {
    public static void main(String[] args)  {
        String dosyaAdi = "Dosya.txt";
        File dosya = new File(dosyaAdi);

        try {
            dosya.createNewFile();
            System.out.println(dosyaAdi + "isminde bir Dosya oluşturuldu");
        }catch (IOException e){
            System.out.println("Hata: Dosya oluşturulamadı!!!");
        }

        Scanner dosyaOku = null;
        try {
            dosyaOku = new Scanner(new File(dosyaAdi));
           /* System.out.println("dosyaOku.nextLine() = " + dosyaOku.nextLine());
            System.out.println("dosyaOku.nextLine() = " + dosyaOku.nextLine());*/
            while (dosyaOku.hasNext()){
                System.out.println("dosyaOku.nextLine() = " + dosyaOku.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
