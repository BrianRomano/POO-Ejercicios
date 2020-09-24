package customer;

public class Customer { //Tipo de dato 'No primitivo'
    private int customerId; //Tipo de dato 'Primitivo'
    private String name; //Tipo de dato 'No primitivo'
    private int phoneNumber; //Tipo de dato 'Primitivo'
    private String emailAddress; //Tipo de dato 'No primitivo'
    private char status; //Tipo de dato 'Primitivo'
    private double totalPurchase; //Tipo de dato 'Primitivo'
    private Address homeAddress; //Tipo de dato 'No primitivo'

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getStatus() {
        return status;
    }

    public void setTotalPurchase(double totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public String toString() { //Tipo de dato 'No primitivo'
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", status=" + status +
                ", totalPurchase=" + totalPurchase +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
