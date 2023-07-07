package dersler.gun13_ternary_operator;

public class SwitchToTernary {
    public static void main(String[] args) {

        int not = 80;
        String puan = "";

        // Switch Case
        switch (not){
            case 90:
                puan = "Puaniniz A";
                break;
            case 80:
                puan = "Puaniniz B";
                break;
            case 70:
                puan = "Puaniniz C";
                break;
            case 60:
                puan = "Puaniniz D";
                break;
            case 50:
                puan = "Puaniniz E";
                break;
            default:
                puan = "kaldiniz";
        }
        System.out.println("puan = " + puan);

        //Ternary

        puan = (not>=90)? "Puaniniz A"
                : (not>=80) ? "Puaniniz B"
                : (not>=70) ? "Puaniniz C"
                : (not>=60) ? "Puaniniz D"
                : (not>=50) ? "Puaniniz E"
                : "Kaldiniz";

        System.out.println("puan = " + puan);
    }
}
