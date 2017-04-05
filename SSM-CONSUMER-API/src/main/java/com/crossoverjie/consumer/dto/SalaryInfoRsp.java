package com.crossoverjie.consumer.dto;

import java.io.Serializable;

public class SalaryInfoRsp implements Serializable {
    private int userId ;
    private String username ;
    private double price ;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}