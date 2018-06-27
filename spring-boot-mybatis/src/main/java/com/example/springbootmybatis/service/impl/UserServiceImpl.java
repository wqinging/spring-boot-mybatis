package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.domain.Customer;
import com.example.springbootmybatis.domain.Student;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.service.ICService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements ICService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Student> getAllUser() {
        return userMapper.getAllStudent();
    }

    @Override
    public Customer getOneUser(String name) {
        return userMapper.getOneCustomer(name);
    }

    @Override
    public void updateUser(Customer customer) {
          userMapper.update(customer);
    }

    @Override
    public void deleteUser(int id) {
          userMapper.deleteCustomer(id);
    }

    @Override
    public int insertUser(Customer customer) {
        return userMapper.insertCustomer(customer);
    }
}
