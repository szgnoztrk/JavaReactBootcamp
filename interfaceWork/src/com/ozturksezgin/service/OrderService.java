package com.ozturksezgin.service;

import com.ozturksezgin.model.Campaign;
import com.ozturksezgin.model.Order;
import com.ozturksezgin.model.Product;

public class OrderService {
    private Order order;

    public OrderService(Order order){
        this.order = order;
    }

    public void addOrder(){
        Double totalPrice = 0.0;
        for (Product product : order.getOrderProducts()){
            totalPrice += product.getProductPrice();
        }
        if(order.getOrderCampaign() != null)
            totalPrice -= order.getOrderCampaign().getCampaignDiscount();
        order.setOrderTotalPrice(totalPrice);
        System.out.println("Sipariş Toplam Tutar: " + order.getOrderTotalPrice());
        System.out.println(this.order.getOrderId() + " numaralı sipariş oluşturuldu.");
    }

    public void addCampaignForOrder(Campaign campaign){
        this.order.setOrderCampaign(campaign);
    }
}
