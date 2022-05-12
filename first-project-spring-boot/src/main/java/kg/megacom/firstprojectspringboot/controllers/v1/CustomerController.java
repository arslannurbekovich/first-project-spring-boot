package kg.megacom.firstprojectspringboot.controllers.v1;

import kg.megacom.firstprojectspringboot.models.Customer;
import kg.megacom.firstprojectspringboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Customer append(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Customer> findAllCustomers(){
        return customerService.findAllCustomers();
    }
}
