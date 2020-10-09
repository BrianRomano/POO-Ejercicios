package customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1, cust2;

        cust1 = new Customer(123, "Brian", "Romano"); //<- Constructor

        /*cust1.customerId = 123;
        cust1.setName("Brian");
        cust1.setEmailAddress("brian@brian");

        cust1.displayCustomerInfo();

        cust2 = new Customer();
        cust2.customerId = 456;
        cust2.setName("Leonel");
        cust2.setEmailAddress("leonel@leonel");

        cust2.displayCustomerInfo();

        cust2 = cust1;
        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
         */
        System.out.println(cust1);
    }
}
