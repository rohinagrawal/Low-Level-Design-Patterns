package CascadePattern;
//The Class will not contain any logical functions as it is an entity
// and entity is not responsible for any logical functions.

//POJO -> Plain old Java Object
//It contains only Getter, Setter & Attributes
public class Address {
    private String zip;
    private String city;
    private String state;
    private String country;
    private String house_no;


    public void setZipcode(String pincode) {
        this.zip = pincode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public String getZipcode() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getHouse_no() {
        return house_no;
    }
}
