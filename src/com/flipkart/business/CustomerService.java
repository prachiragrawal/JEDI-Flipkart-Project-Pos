package com.flipkart.business;

import com.flipkart.bean.Customer;
import com.flipkart.dao.CustomerDAO;
import com.flipkart.exception.CustomerAlreadyBookedException;

public class CustomerService {
    private CustomerDAO customerDAO;

    // Constructor
    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    // Business logic methods for customers
    public void registerCustomer(Customer customer) {
        // Implementation to register a customer
        // Validate input, check uniqueness, update database, etc.
    }

    public void onboardGym(int customerId, int centerId) throws CustomerAlreadyBookedException {
        // Implementation to onboard a gym for a customer
        // Validate input, check availability, update database, etc.
    }

    // Other business methods
}
