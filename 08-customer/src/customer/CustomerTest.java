package customer;

public class CustomerTest {  //Tipo de dato 'No primitivo'
    public static void main(String[] args) {
        Customer customerUno = new Customer();
        Address addressUno = new Address();

        customerUno.setCustomerId(1);
        customerUno.setName("Brian");
        customerUno.setPhoneNumber(123456789);
        customerUno.setEmailAddress("brianromanook@gmail.com");
        customerUno.setStatus('a');
        customerUno.setTotalPurchase(999.9);
        customerUno.setHomeAddress(addressUno);
        addressUno.setNombre("Roca");
        addressUno.setAltura(1000);
        addressUno.setCiudad("CABA");

        System.out.println(customerUno);
    }
}
