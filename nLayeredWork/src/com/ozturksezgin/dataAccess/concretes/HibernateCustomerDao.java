package com.ozturksezgin.dataAccess.concretes;

import com.ozturksezgin.dataAccess.abstracts.CustomerDao;
import com.ozturksezgin.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Hibernate: " + customer.getCustomerEmail() + " e-postalı kullanıcı sisteme kayıt edildi.");
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Hibernate: " + customer.getCustomerEmail() + " e-postalı kullanıcı bilgileri güncellendi.");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Hibernate: " + customer.getCustomerEmail() + " e-postalı kullanıcı sistemden silindi.");
    }

    @Override
    public boolean checkEmail(String email) {
        return true;
    }
}
