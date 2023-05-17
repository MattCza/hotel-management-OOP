package people;

public class Guest {
    private String idNumber;
    private String name;
    private String phoneNumber;

    public Guest(String idNumber, String name, String phoneNumber) {
        this.idNumber = idNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
