package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.Customer;

import demo.repository.customerRepository;

@Service
public class CustomerService {
	@Autowired
	customerRepository customerRepository;

	public Customer addCustomer(Customer request) {
		return customerRepository.save(request);
	}

}
