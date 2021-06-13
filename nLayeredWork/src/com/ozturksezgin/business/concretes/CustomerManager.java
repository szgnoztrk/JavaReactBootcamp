package com.ozturksezgin.business.concretes;

import com.ozturksezgin.business.abstracts.CustomerService;
import com.ozturksezgin.dataAccess.abstracts.CustomerDao;
import com.ozturksezgin.entities.concretes.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerManager implements CustomerService {
    private CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void add(Customer customer) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher emailMatcher = pattern.matcher(customer.getCustomerEmail());
        if(customer.getCustomerID() == null || customer.getCustomerEmail().isEmpty() || customer.getCustomerFirstName().isEmpty() || customer.getCustomerLastName().isEmpty() || customer.getCustomerPassword().isEmpty())
            System.out.println("Formda boş alanlar bulunmaktadır!");
        else if(customer.getCustomerPassword().length() < 6)
            System.out.println("Kullanıcı şifresi minimum 6 karakter olmalı!");
        else if(!emailMatcher.matches())
            System.out.println("Kullanıcı e-posta formatını yanlış girdiniz!");
        else if(!customerDao.checkEmail(customer.getCustomerEmail()))
            System.out.println("Kullanıcı e-postası zaten sistemde bulunuyor!");
        else if(customer.getCustomerFirstName().length() < 3 || customer.getCustomerLastName().length() < 3)
            System.out.println("Kullanıcı ad veya soyad minimum 2 karakter olmalıdır!");
        else
            customerDao.add(customer);

    }
}
