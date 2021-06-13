package com.ozturksezgin.model;

import java.util.Date;
import java.util.List;

public class Order {
    private Long orderId;
    private User orderCustomer;
    private List<Product> orderProducts;
    private Date orderDate;
    private Campaign orderCampaign;
    private Double orderTotalPrice;

    public Order(Long orderId, User orderCustomer, List<Product> orderProducts, Date orderDate) {
        this.orderId = orderId;
        this.orderCustomer = orderCustomer;
        this.orderProducts = orderProducts;
        this.orderDate = orderDate;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public User getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(User orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<Product> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Campaign getOrderCampaign() {
        return orderCampaign;
    }

    public void setOrderCampaign(Campaign orderCampaign) {
        this.orderCampaign = orderCampaign;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }
}
