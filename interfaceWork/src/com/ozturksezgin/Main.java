package com.ozturksezgin;

import com.ozturksezgin.model.Campaign;
import com.ozturksezgin.model.Order;
import com.ozturksezgin.model.Product;
import com.ozturksezgin.model.User;
import com.ozturksezgin.service.UserService;
import com.ozturksezgin.service.OrderService;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "Sezgin", "ÖZTÜRK", "1996-10-24", "29776973134");
        Product product1 = new Product(1L,"GTA V", "2014 Game", 150L, 180.50, new Date());
        Product product2 = new Product(1L,"GTA V", "2014 Game", 150L, 180.50, new Date());
        Campaign campaign = new Campaign(1L, "Summer Sale", "SUMMER2021", 25.99, new Date(), new Date());
        Order order = new Order(1L, user, Arrays.asList(product1, product2), new Date());

        UserService userService = new UserService(user);
        userService.signUp();
        OrderService orderService = new OrderService(order);

        orderService.addCampaignForOrder(campaign);
        orderService.addOrder();
        System.out.println("Selam");

    }
}
