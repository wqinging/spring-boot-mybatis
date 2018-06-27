package com.example.springbootmybatis.service;

import com.example.springbootmybatis.domain.Customer;
import com.example.springbootmybatis.domain.Student;

import java.util.List;


public interface ICService {
    List<Student> getAllUser();
    Customer getOneUser(String name);
    void updateUser(Customer customer);
    void deleteUser(int id);
    int insertUser(Customer customer);
}
