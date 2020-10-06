package customer;

public class Customer {
    int customerId;
    private String name;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void displayCustomerInfo(){
        System.out.println("Customer ID: "+customerId);
        System.out.println("Name: "+ getName());
        System.out.println("Email: "+getEmailAddress());
        System.out.println("---------------------------");
    }
}
