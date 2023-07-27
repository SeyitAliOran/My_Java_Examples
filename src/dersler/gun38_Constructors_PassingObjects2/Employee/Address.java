package dersler.gun38_Constructors_PassingObjects2.Employee;

public class Address {
    String street;
    String city;
    String state;
    String postcode;

    public Address(String street, String city, String state, String postcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
    }
    public String getFullAddress(){
        return street + ", " + city + ", " + state + ", " + postcode;
    }
}
