package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.domain.Customer;
import com.example.springbootmybatis.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from student")
    @Results({
            @Result(property = "id",column = "studentNo"),
            @Result(property = "loginPwd",column = "loginPwd"),
            @Result(property = "studentName",column = "studentName"),
            @Result(property = "sex",column = "sex"),
            @Result(property = "gradeID",column = "gradeID"),
            @Result(property = "phone",column = "phone"),
            @Result(property = "address",column = "address"),
            @Result(property = "bornDate",column = "bornDate"),
})
    List<Student> getAllStudent();

    @Select("select * from customer where cus_name = #{cusName}")
    @Results({
            @Result(property = "cusId",column = "cus_id"),
            @Result(property = "cusName",column = "cus_name")
    })
    Customer getOneCustomer(String name);

    @Update("update customer set cus_name = #{cusName} where cus_id=#{cusId}")
    void update(Customer customer);

    @Delete("delete from customer where cus_id=#{cusId}")
    void deleteCustomer(int id);

    @Insert("insert into customer(cus_name) value (#{cusName})")
    int insertCustomer(Customer customer);
}
