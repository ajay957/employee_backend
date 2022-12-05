package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   @GetMapping("/")
    public String HomePage(){
       return "welcome to employee home page";
   }

   @GetMapping("/add")
    public String AddEmployee(){
       return "welcome to add employee page";
   }


}
