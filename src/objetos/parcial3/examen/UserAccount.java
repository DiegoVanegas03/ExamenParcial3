package objetos.parcial3.examen;

public class UserAccount {
    private String email;
    private String name;
    private String ZipCode;
    private String phoneNumber;
    private String id;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

