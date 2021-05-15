package Entities;

import Abstract.Entity;

public  class Customer implements Entity {
	public int id;
	public int DateYear;
	public long NationalityId;
	public String FirstName;
	public String LastName;
	
	
	
	public Customer(int id, int dateYear, long nationalityId, String firstName, String lastName) {
		super();
		this.id = id;
		DateYear = dateYear;
		NationalityId = nationalityId;
		FirstName = firstName;
		LastName = lastName;
		}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getDateYear() {
		return DateYear;
	}



	public void setDateYear(int dateYear) {
		DateYear = dateYear;
	}



	public long getNationalityId() {
		return NationalityId;
	}



	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}
	}