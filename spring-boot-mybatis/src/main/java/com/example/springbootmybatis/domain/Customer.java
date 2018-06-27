package com.example.springbootmybatis.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class Customer {


    private int cusId;
    @NotEmpty(message = "姓名不能为空")
    private String cusName;
    public Customer(int cusId, String cusName) {
        this.cusId = cusId;
        this.cusName = cusName;
    }

    public Customer() {
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", cusName='" + cusName + '\'' +
                '}';
    }
}
