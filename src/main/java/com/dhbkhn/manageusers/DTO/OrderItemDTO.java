package com.dhbkhn.manageusers.DTO;

import java.math.BigDecimal;

public class OrderItemDTO {
    private int id;
    private String status;
    private int productId;
    private int orderProductId;
    private int shopBoatId;
    private int quantity;
    private BigDecimal price;
    private BigDecimal sale;
    private String productAvatar;
    private String productName;

    public OrderItemDTO() {
    }

    public OrderItemDTO(int id, String status, int productId, int orderProductId, int shopBoatId, int quantity,
            BigDecimal price,
            BigDecimal sale, String productAvatar, String productName) {
        this.id = id;
        this.status = status;
        this.productId = productId;
        this.orderProductId = orderProductId;
        this.shopBoatId = shopBoatId;
        this.quantity = quantity;
        this.price = price;
        this.sale = sale;
        this.productAvatar = productAvatar;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(int orderProductId) {
        this.orderProductId = orderProductId;
    }

    public int getShopBoatId() {
        return shopBoatId;
    }

    public void setShopBoatId(int shopBoatId) {
        this.shopBoatId = shopBoatId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    public String getProductAvatar() {
        return productAvatar;
    }

    public void setProductAvatar(String productAvatar) {
        this.productAvatar = productAvatar;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
