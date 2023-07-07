package dersler.gun14_ForLoop1;

public class ForLoopRules {
    public static void main(String[] args) {

        System.out.println(" For loop rules....");

        // Standart
        System.out.println("Dongu oncesi kod satiri.");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Merhaba Java.");
        }
        System.out.println("Dongu sonrasi kod satiri.");
        System.out.println();

        // !-10 arasi cift sayilari ekrana yazdiran for loop
        for (int i = 0; i <=10 ; i+=2) {
                System.out.println(i);
            }
        System.out.println();

        // kritik islemlerde kodun hatasiz calismasini istiyorsak if ile extra kod eklenebilir....
        for (int i = 0; i <=10; i++) {
            if(i%2==0) System.out.println(i);

        }
        System.out.println();
        // Degisken tanimi ve deger atamas For loop un disinda olabilir..
        int sayi = 0;
        for (; sayi < 10; sayi++) {
            System.out.println(sayi);
        }
        System.out.println("Sayi degiskeninin degerine loop disindanda erisilebilir");
        System.out.println("Sayi(loop disi) : " + sayi);
        System.out.println();

        // Degiskenin degerini dongunun icerinde degistirebiliriz

        for (int i = 0; i < 10; ) {
            System.out.println("i = " + i);
            i++;

        }
        System.out.println();

        // bu sekil de sonsuz deger olusur
       /* for(;;){
            System.out.println("merhababbbbb");
        }
        */

        //
        boolean devam = true;
        for(int sayac = 0; devam; sayac++){
            if(sayac>10){
                devam = false;
            }
            System.out.println("sayac = " + sayac);
        }
        System.out.println();
        // Char Type ------> A-Z harflerini ekrana yazdiran program.... Her belli satirda bir alt satira gec
        for(char harf = 'A'; harf <='Z'; harf++){
            System.out.print(harf + " ");
        }
        System.out.println();
        int satir = 1;
        for (char harf =1; harf <= 100; harf++,satir++) {
            System.out.print(harf + "-" + (int)harf); // karakterlerin sayi degerlerini gosterme
            if(satir %15== 0) System.out.println(); // her 15 satirda bir alt satira gecen kod bolumu
        }
        System.out.println();

        //1500 ile 2500 arasi tek sayilari yazdiran program.
        int numCounter = 0; // donugunun disinda bu degiskene itiyacimiz oldugu icin burada tanimladik....
        for(int number = 1500; number < 2500; number++){ // numCounter eger buraya yazmis olsaydik dongunun icindeki sayi dongusunu hesaplardi
            if(number %2==1){
                System.out.println(number);
                numCounter++; // numCounter i buraya yazmamizin sebebi kac tane tek sayi oldugunu hesaplamak...
            }
        }
        System.out.println("1500 - 2500 arasinda " + numCounter + " adet tek sayi vardir.");
    }
}
