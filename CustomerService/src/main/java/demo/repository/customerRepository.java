package demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import demo.entity.Customer;

	public interface customerRepository extends JpaRepository<Customer, Long> {

	

	public Customer save(Customer request);

	}
