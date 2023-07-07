package dersler.gun17_Review;

public class TrafficLights {
    public static void main(String[] args) {
        //Trafik isik renklerine göre isigi tespit eden bir program yaziniz

        // switch case de double ve float kullanilmaz.....
        char color = 'r';
        String trafficLight;
        switch (color){
            case 'R': case 'r':
                trafficLight = "RED";
                break;
            case 'O': case 'o':
                trafficLight = "Orange";
                break;
            case 'G':case 'g':
                trafficLight = "Green";
                break;
            default:
                trafficLight = "Invalid Light";
        }
        System.out.println("Traffic Light = " + trafficLight);
    }
}
