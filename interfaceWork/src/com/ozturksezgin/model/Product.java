package com.ozturksezgin.model;

import java.util.Date;

public class Product {
    private Long productId;
    private String productName;
    private String productDetail;
    private Long productQuantity;
    private Double productPrice;
    private Date productCreatedDate;

    public Product(Long productId, String productName, String productDetail, Long productQuantity, Double productPrice, Date productCreatedDate) {
        this.productId = productId;
        this.productName = productName;
        this.productDetail = productDetail;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productCreatedDate = productCreatedDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public Long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Long productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Date getProductCreatedDate() {
        return productCreatedDate;
    }

    public void setProductCreatedDate(Date productCreatedDate) {
        this.productCreatedDate = productCreatedDate;
    }
}
