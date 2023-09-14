package dersler.gun62_OopReview.FileOps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        String dosya = "Dosya.txt";
        try {
            // PrintWriter printWriter = new PrintWriter(dosya); //Always create a new empty file.
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(dosya,true)); //Appending
            printWriter.println("Merhaba ben yeni bir satırım.");

            printWriter.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Dosya okuma
        try {
            Scanner oku = new Scanner(new File(dosya));
            while (oku.hasNext()){
                System.out.println(oku.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
