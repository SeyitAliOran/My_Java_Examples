package dersler.gun21_Rewiew;

import java.util.Scanner;

public class BankaProgrami {
    public static void main(String[] args) {
        showMenu();

    }

    public static int paraCek(int bakiye, int tutar){
        if(tutar <= bakiye){
            return bakiye-tutar;
        }
        return bakiye;
    }

    public static int paraYatir(int bakiye, int tutar){
        if (tutar > 0){
            return  bakiye + tutar;
        }
        return bakiye;
    }
    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        int bakiye = 1000;
        int tutar = 0;
        int secim = 1;

        anaMenu:
        while (secim != 0) {
            System.out.println("---------Ana Menü ----------");
            System.out.println("1-Bankacılık işlemleri");
            System.out.println("2-Kredi Kartı işlemleri");
            System.out.println("3-Bakiye görüntüleme");
            System.out.println("0-Programdan çıkış");
            System.out.println();
            System.out.print("Lütfen seçiminiz giriniz ---> ");
            secim = sc.nextInt();

            switch (secim) {
                case 1: //Bankacılık işlemleri
                    bankaIslmMenu:
                    while (true) {
                        System.out.println("Bankacılık işlemlerine hoşgeldiniz!");
                        System.out.println("1-Para çekme");
                        System.out.println("2-Para yatırma");
                        System.out.println("3-Bakiye görüntüleme");
                        System.out.println("4-Ana menü");
                        System.out.println("5-Programdan çık.");
                        System.out.println();
                        System.out.print("Lütfen seçiminiz giriniz ---> ");
                        secim = sc.nextInt();

                        switch (secim) {
                            case 1:
                                System.out.println("*** Para çekme işlemleri ***");
                                System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                                tutar = sc.nextInt();
                                bakiye = paraCek(bakiye,tutar);
                                System.out.println("Güncel bakiyeniz = " + bakiye);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("*** Para yatırma işlemi ***");
                                System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                                tutar = sc.nextInt();
                                bakiye = paraYatir(bakiye,tutar);
                                System.out.println("Güncel Bakiye = " + bakiye);
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("Bakiyeniz görüntülendi");
                                System.out.println("Güncel Bakiye = " + bakiye);
                                System.out.println();
                                break;
                            case 4:
                                break bankaIslmMenu;
                            // continue anaMenu;
                            case 5:
                                System.out.println("Bankamızı tercih ettiğiniz için teşekkürler.");
                                System.out.println("Programdan çıkılıyor.");
                                break anaMenu;
                            default:
                                System.out.println("Yanlış seçim yaptınız!!!");
                        }
                    }
                case 2:
                    System.out.println("Kredi kartı işlemleri");
                    break ;
                case 3:
                    System.out.println("Güncel bakiyeniz = " + bakiye);
                    break;
                case 0:
                    secim = 0;
                    System.out.println("Programdan çıkılıyor.");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız!!!");
            }
        }
    }
}
