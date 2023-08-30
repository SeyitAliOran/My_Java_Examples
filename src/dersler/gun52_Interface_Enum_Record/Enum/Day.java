package dersler.gun52_Interface_Enum_Record.Enum;

public enum Day {
    // day tipine buradaki yazilanlarin diisinda deger atanamaz.
    // enum ile girilen degerleri belirli bir alanda kisitliyoruz
    //
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static boolean isValidDay(String strDay) {
        for (Day day : values()) {//returns the all values.
            if (day.name().equals(strDay)) {
                return true;
            }
        }
        return false;
    }
}
