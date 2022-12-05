package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   @GetMapping("/")
    public String HomePage(){
       return "welcome to employee home page";
   }

   @PostMapping("/add")
    public String AddEmployee(){
       return "welcome to add employee page";
   }

   @PostMapping("/search")
    public String SearchEmployee(){
       return "search an employee";
   }
   @PostMapping("/edit")
    public String EditEmployee(){
       return "edit an employee";
   }
   @GetMapping("/view")
    public String ViewAllEmployee(){
       return "View all the employee";
   }
   @PostMapping("/delete")
    public String DeleteEmployee(){
       return "delete an employee";
   }


}
