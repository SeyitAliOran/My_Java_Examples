package dersler.gun62_OopReview.ClassRelationShip.Composition;

public class BuildingTest {
    public static void main(String[] args) {
        Building bina = new Building(EnumBuildingTypes.OFFICE);
        bina.addRoom("Mutfak", 20, 2, 2, EnumColors.WHITE);
        bina.addRoom("Salon",40,4,1,EnumColors.BLUE);

        System.out.println("bina = " + bina);
    }
}
