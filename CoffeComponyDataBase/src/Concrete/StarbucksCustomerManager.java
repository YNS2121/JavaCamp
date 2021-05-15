package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService  customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public  void save(Customer customer) {
		
		
		if(_customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to DataBase " + customer.FirstName);
		}else {
			System.out.println("not a valid person");
		}
	}

	

}
