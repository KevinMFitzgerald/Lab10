package ie.atu.week11example;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    // Placeholder method to save a person (add to Db in the next two weeks)
    private PaymentClient paymentClient;
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
        String repsonse=paymentClient.makePayment(person);
        System.out.println(repsonse);
    }

    public PersonService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        String repsonse=paymentClient.EmployeeId(employeeId)+"done";
        System.out.println(repsonse);
        return new Person();
    }
}
