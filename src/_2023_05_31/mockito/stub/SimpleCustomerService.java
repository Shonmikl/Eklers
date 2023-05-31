package _2023_05_31.mockito.stub;

public class SimpleCustomerService implements CustomerService {

	CustomerRepository customerRepository;

	public SimpleCustomerService(CustomerRepository customerRepository){
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer getCustomerById(long id) {
		return customerRepository.getCustomerById(id);
		
	}
}