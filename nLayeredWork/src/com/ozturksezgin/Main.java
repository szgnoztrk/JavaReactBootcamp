package com.ozturksezgin;

import com.ozturksezgin.business.abstracts.CustomerService;
import com.ozturksezgin.business.concretes.CustomerManager;
import com.ozturksezgin.core.abstracts.Authentication;
import com.ozturksezgin.core.concretes.GoogleAuthentication;
import com.ozturksezgin.dataAccess.concretes.HibernateCustomerDao;
import com.ozturksezgin.entities.concretes.Customer;

public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerManager(new HibernateCustomerDao());

        Customer customer = new Customer(1, "", "Öztürk", "szgnoztrk@gmail.com", "123456");

        customerService.add(customer);

        //Authentication authentication = new GoogleAuthentication();
        //authentication.register();
    }
}
