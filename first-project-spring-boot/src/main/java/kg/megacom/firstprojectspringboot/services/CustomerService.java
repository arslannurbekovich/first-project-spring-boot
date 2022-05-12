package kg.megacom.firstprojectspringboot.services;

import kg.megacom.firstprojectspringboot.models.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> findAllCustomers();
}
