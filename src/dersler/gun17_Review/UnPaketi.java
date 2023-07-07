package dersler.gun17_Review;

public class UnPaketi {
    public static void main(String[] args) {
        // Elimizdeki belli sayida 5 kiloluk ve 1 kiloluk un paketi sayisina gore
        // musterinin talep ettigi kilo sayida paketi verip veremeyecegimizi gosteren bir program yaziniz

        int beslikPaketSayisi = 3;
        int birlikPaketSayisi = 3;
        int talep = 9;
        boolean sonuc = false;

        if(beslikPaketSayisi * 5 >= talep){
            if(birlikPaketSayisi >= talep % 5){
                sonuc = true;
            }
        }else{
            if(birlikPaketSayisi >= talep - beslikPaketSayisi * 5){
                sonuc = true;
            }
        }

        if(sonuc){
            System.out.println(talep + " kilo talep karsilanabilir");
        }else{
            System.out.println(talep + " kilo talep karsilanamaz");
        }

    }
}
