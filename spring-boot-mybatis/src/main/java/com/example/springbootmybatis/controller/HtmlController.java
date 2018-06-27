package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.domain.Customer;
import com.example.springbootmybatis.domain.Student;
import com.example.springbootmybatis.service.ICService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HtmlController {

    @Autowired
    private ICService icService;

    @ModelAttribute
    Customer setCustomer () {
        return new Customer ();
    }

    @GetMapping("/index")
    public  String testHtml(){
        return "index";
    }

    @PostMapping("/register")
    public String register(Model mav, @Valid Customer customer, BindingResult results){
        mav.addAttribute("customer",customer);
        if(results.hasErrors()){
            List<ObjectError> list = results.getAllErrors();
            for(ObjectError error:list){
                System.out.println("123");
                System.out.println(error.getCode()+"---"+error.getArguments()+"---"+error.getDefaultMessage());
            }
            return "index";
        }else{
            System.out.println(customer.getCusName());
            int result = icService.insertUser(customer);
//            System.out.println(result);
            mav.addAttribute("result",result);
            mav.addAttribute("text", "xxxxxxxxxxx");
            return "result";
        }

    }

    @GetMapping(value="/getAllCustomer")
    public String getAllCustomer(Model model){
        List<Student> list = icService.getAllUser();
        model.addAttribute("list",list);
        return "html/showallcustomer";
    }
}
