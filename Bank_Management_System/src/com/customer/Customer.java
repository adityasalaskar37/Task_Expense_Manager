package com.customer;

public class Customer {
	private String customerId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    
	public Customer(String customerId, String name, String address, String phoneNumber, String email) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	public static Customer createCustomerProfile(String customerId, String name, String address, String phoneNumber, String email) {
		return new Customer(customerId, name, address, phoneNumber, email);

	}
    
	public String viewCustomerProfile() {
		return "Customer ID: "+ customerId +"\nName: "+name+"\nAddress: "+address+"\nPhone Number: "+phoneNumber+"\nEmail: "+email;
	}
    

}
