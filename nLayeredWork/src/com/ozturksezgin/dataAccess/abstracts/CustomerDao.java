package com.ozturksezgin.dataAccess.abstracts;

import com.ozturksezgin.entities.concretes.Customer;

public interface CustomerDao {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
    boolean checkEmail(String email);
}
