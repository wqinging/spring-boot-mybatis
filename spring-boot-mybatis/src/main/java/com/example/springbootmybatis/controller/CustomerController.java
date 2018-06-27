package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.domain.Customer;
import com.example.springbootmybatis.domain.Student;
import com.example.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getallcustomer")
    public List<Student> getAllStudent(){
        return userMapper.getAllStudent();

    }

    @GetMapping("/getonecustomer")
    public Customer getOneCustomer(String name){
       return userMapper.getOneCustomer(name);
    }

    @GetMapping("/insertcustomer")
    public void insertcustomer(String name){
        Customer customer = new Customer();
        customer.setCusName(name);
        userMapper.insertCustomer(customer);

    }

    @GetMapping("/updatecustomer")
    public void updatecustomer(int id,String name){
        Customer customer =new Customer();
        customer.setCusId(id);
        customer.setCusName(name);
        userMapper.update(customer);
    }

    @GetMapping("/deletecustomer")
    public void deletecustomer(int id){
        userMapper.deleteCustomer(id);
    }

}
