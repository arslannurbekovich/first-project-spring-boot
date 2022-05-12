package kg.megacom.firstprojectspringboot.services.impl;

import kg.megacom.firstprojectspringboot.dao.CustomerRepo;
import kg.megacom.firstprojectspringboot.models.Customer;
import kg.megacom.firstprojectspringboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer saveCustomer(Customer customer) {
        customer = customerRepo.save(customer);
        // insert into customer(firstname, lastname) values("Dolon", "Askarbekov")
        return customer;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepo.findAll();
        //select * from customer
    }
}
