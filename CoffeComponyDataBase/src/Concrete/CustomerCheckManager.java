package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) 
	{
		return true;
	

	}

}
