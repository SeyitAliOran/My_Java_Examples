package dersler.gun52_Interface_Enum_Record.Record;

public record PersonRecord(String name,String address,int number,int telNumber,String isYeriAdresi) {
    public PersonRecord {
    }

    public PersonRecord(String name, String address) {
        this(name, address, 0, 0, null);
    }

    public PersonRecord(String name, int telNumber) {
        this(name, null, 0, telNumber, null);
    }

}
