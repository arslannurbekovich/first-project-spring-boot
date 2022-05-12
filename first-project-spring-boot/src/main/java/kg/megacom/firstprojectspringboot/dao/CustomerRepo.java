package kg.megacom.firstprojectspringboot.dao;

import kg.megacom.firstprojectspringboot.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
