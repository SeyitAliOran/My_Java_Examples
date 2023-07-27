package dersler.gun07_TypeCasting;

public class Task1Task2Task3Task4 {
    public static void main(String[] args) {
        //TASK1
       int pies1 =10, people1=4;
        double piesPerson1;
        piesPerson1 = pies1 / people1;
        System.out.println("piesPerson = " + piesPerson1);

        //TASK2
        int pies2 =10, people2=4;
        double piesPerson2;
        piesPerson2 = (double) pies2 / people2;
        System.out.println("piesPerson = " + piesPerson2);

        //TASK3
        int pies3 =10, people3=4;
        double piesPerson3;
        piesPerson3 =  pies3 / (double) people3;
        System.out.println("piesPerson = " + piesPerson3);

        //TASK4
        /*int pies =10, people=4;
        double piesPerson;
        piesPerson = double (pies /  people); islem yapilmaz. DOUBLE degerinin parantez icine alinmasi gerekiyor.
        System.out.println("piesPerson = " + piesPerson);*/
    }
}
