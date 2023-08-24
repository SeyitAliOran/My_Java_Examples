package dersler.gun48_FinalKeyword_MethodHiding;

public class FinalMethodChild extends FinalMethodParent{

    @Override
    public void normalMethod(String mesaj) {
        super.normalMethod(mesaj.toUpperCase());
    }

   /* Final methodlar override edilemez
  public double kdvHesapla(double miktar){
       return 0;
   }
    */
   public static void main(String[] args) {
       FinalMethodChild obj = new FinalMethodChild();
       FinalMethodParent objParent = new FinalMethodParent();

       System.out.println("obj.KDV_ORANI = " + obj.KDV_ORANI);
       System.out.println("obj.kdvHesapla(100) = " + obj.kdvHesapla(100));
       obj.normalMethod("deneme mesaji"); // final tanimlanmamis method override edilebilir
       objParent.normalMethod("deneme mesaji");
   }

}
