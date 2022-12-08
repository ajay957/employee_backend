package com.example.employee_backend.controller;

import com.example.employee_backend.dao.EmployeeDao;
import com.example.employee_backend.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;

@RestController
public class EmployeeController {
   @Autowired
   private EmployeeDao dao;
   @GetMapping("/")
    public String HomePage(){
       return "welcome to employee home page";
   }
   @CrossOrigin(origins = "*")
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
       dao.save(e);
       return "employee added successfully";
   }
   @CrossOrigin(origins = "*")
   @GetMapping("/view")
   public List<Employees> viewAll(){
      return(List<Employees>) dao.findAll();
   }
   @CrossOrigin("*")
   @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
   public List<Employees> SearchEmployee(@RequestBody Employees e){
      String empcode=String.valueOf(e.getEmp_code());
      System.out.println(empcode);
      return (List<Employees>) dao.SearchEmployee(e.getEmp_code());
   }

}
