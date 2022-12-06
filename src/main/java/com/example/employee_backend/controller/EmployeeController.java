package com.example.employee_backend.controller;

import com.example.employee_backend.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   @GetMapping("/")
    public String HomePage(){
       return "welcome to employee home page";
   }

   @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody Employees e){
       System.out.println(e.getEmp_code());
       System.out.println(e.getEmp_name().toString());
       System.out.println(e.getDesignation().toString());
       System.out.println(e.getSalary());
       System.out.println(e.getCom_name().toString());
       System.out.println(e.getMob_no().toString());
       System.out.println(e.getUsername().toString());
       System.out.println(e.getPassword().toString());
       return "employee added successfully";
   }



}
